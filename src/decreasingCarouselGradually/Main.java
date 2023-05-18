package decreasingCarouselGradually;

public class Main {

    public static void main(String[] args) {
        /*
        CarouselRun run = new GraduallyDecreasingCarousel(7).run();
        System.out.println(run.isFinished()); //true
        System.out.println(run.next()); //-1
        */
        //*
        DecrementingCarousel carousel = new GraduallyDecreasingCarousel(7);
        System.out.println(carousel.addElement(20)); //20 - true
        System.out.println(carousel.addElement(30)); //30 - true
        System.out.println(carousel.addElement(10)); //10 - true

        CarouselRun run = carousel.run();

        System.out.println(run.isFinished()); //false

        System.out.println(run.next()); //20
        System.out.println(run.next()); //30
        System.out.println(run.next()); //10

        System.out.println(run.next()); //19
        System.out.println(run.next()); //29
        System.out.println(run.next()); //9

        System.out.println(run.next()); //17
        System.out.println(run.next()); //27
        System.out.println(run.next()); //7

        System.out.println(run.next()); //14
        System.out.println(run.next()); //24
        System.out.println(run.next()); //4

        System.out.println(run.next()); //10
        System.out.println(run.next()); //20

        System.out.println(run.next()); //5
        System.out.println(run.next()); //15

        System.out.println(run.next()); //9

        System.out.println(run.next()); //2

        System.out.println(run.isFinished()); //true
        System.out.println(run.next()); //-1
        //*/
    }
}
