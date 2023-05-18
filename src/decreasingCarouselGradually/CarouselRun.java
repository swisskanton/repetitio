package decreasingCarouselGradually;

import java.util.LinkedList;

public class CarouselRun {
    LinkedList<Integer> elements;
    boolean isFinished;
    String operation;
    int nextCounter;


    private static volatile CarouselRun obj;

    private CarouselRun(LinkedList<Integer> elements){
        this.elements = elements;
        this.isFinished = false;
        this.operation = "decrementing";
        this.nextCounter = 0;
    }

    private CarouselRun(LinkedList<Integer> elements, String operation){
        this.elements = elements;
        this.isFinished = false;
        this.operation = operation;
        this.nextCounter = 0;
    }

    private static CarouselRun setDefault(LinkedList<Integer> elements, String operation) {
        obj.elements = elements;
        obj.isFinished = false;
        obj.operation = operation;
        obj.nextCounter = 0;
        return obj;
    }

    public static CarouselRun getCarouselRun(LinkedList<Integer> elements){
        //CarouselRun result = null;
        if (obj == null){
            synchronized(CarouselRun.class){
                if (obj == null){
                    obj = new CarouselRun(elements);
                    //result = obj;
                }
            }
        } else if (obj.elements.size() != elements.size()) {
            obj = setDefault(elements, "decrementing");
        }
        return obj; //result;
    }

    public static CarouselRun getCarouselRun(LinkedList<Integer> elements, String operation){
        //CarouselRun result = null;
        if (obj == null){
            synchronized(CarouselRun.class){
                if (obj == null){
                    obj = new CarouselRun(elements, operation);
                    //result = obj;
                }
            }
        } else { //if (obj.elements.size() != elements.size()) {
            obj = setDefault(elements, operation);
        }
        return obj; //result;
    }

    public int next() {
        int element = switch (this.operation) {
            case "decrementing" -> decreaseByOne();
            case "halving" -> decreaseByHalf();
            case "gradually" -> decreaseByGradually();
            default -> -1;
        };

        if (this.elements.isEmpty())
            this.isFinished = true;
        return element;
    }

    public boolean isFinished() {
        return this.isFinished || this.elements.isEmpty();
    }

    private void addElement(int num) {
        this.elements.addLast(num);
    }

    private int getFirst() {
        int num = -1;
        if (!this.elements.isEmpty())
            num = this.elements.pollFirst();
        return num;
    }

    private int decreaseByOne() {
        int num = getFirst();
        if (num > 1)
            addElement(num - 1);
        return num;
    }

    private int decreaseByHalf() {
        int num = getFirst();
        if (num > 1)
            addElement(num / 2);
        return num;
    }

    private boolean isAnyElementValid() {
        boolean isValid = false;
        for (int i: this.elements) {
            if (i > 0) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }

    private int decreaseByGradually() {
        int num = -1;
        if (isAnyElementValid()) {
            num = getFirst();
            while (num <= 0) {
                addElement(num);
                num = getFirst();
                this.nextCounter++;
            }
        }
        int subtrahend = nextCounter / (this.elements.size() + 1) + 1;
        addElement(num - subtrahend);
        this.nextCounter++;
        if (!isAnyElementValid()) {
            this.elements.clear();
            this.isFinished = true;
        }
        return num;
    }
}
