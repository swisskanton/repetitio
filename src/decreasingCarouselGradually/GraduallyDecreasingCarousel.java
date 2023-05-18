package decreasingCarouselGradually;

public class GraduallyDecreasingCarousel extends DecrementingCarousel{
    String operation;

    public GraduallyDecreasingCarousel(final int capacity) {
        super(capacity);
        this.operation = "gradually";
    }

    @Override
    public CarouselRun run(){
        this.isWorkingCarusoRun = true;
        return CarouselRun.getCarouselRun(this.elements, operation);
    }
}
