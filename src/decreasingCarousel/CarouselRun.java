package decreasingCarousel;

import java.util.LinkedList;

public class CarouselRun {
    LinkedList<Integer> elements;
    boolean isFinished;

    private static volatile CarouselRun obj;
    private CarouselRun(LinkedList<Integer> elements){
        this.elements = elements;
        this.isFinished = false;
    }

    public static CarouselRun getCarouselRun(LinkedList<Integer> elements){
        CarouselRun result = null;
        if (obj == null){
            synchronized(CarouselRun.class){
                if (obj == null){
                    obj = new CarouselRun(elements);
                    result = obj;
                }
            }
        } else if (obj.elements.size() != elements.size()) {
            obj.elements = elements;
            obj.isFinished = false;
        }
        return result;
    }

    public int next() {
        Integer element = -1;
        if (this.elements.isEmpty()) {
            this.isFinished = true;
        } else {
            element = this.elements.pollFirst();
            if (element > 1) {
                this.elements.addLast(element - 1);
            }
            if (this.elements.isEmpty())
                this.isFinished = true;
        }
        return element;
    }

    public boolean isFinished() {
        return this.isFinished || this.elements.isEmpty();
    }

}