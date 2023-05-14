package decreasingCarousel;

import java.util.LinkedList;

public class DecrementingCarousel {
    int capacity;
    LinkedList<Integer> elements;
    boolean isWorkingCarusoRun;

    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        this.elements = new LinkedList<>();
        this.isWorkingCarusoRun = false;
    }

    public boolean addElement(int element){
        boolean isSuccessful = false;
        if (element > 0 && elements.size() < this.capacity && !isWorkingCarusoRun) {
            this.elements.add(element);
            isSuccessful = true;
        }
        return isSuccessful;
    }

    public CarouselRun run(){
        this.isWorkingCarusoRun = true;
        return CarouselRun.getCarouselRun(this.elements);
    }
}
