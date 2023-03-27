/*
Create a Sharpie class
    We should know the followings about each sharpie:
        color (which should be a string),
        width (which will be a number) and the
        inkAmount (another number)
    We need to specify the color and the width at creation
    Every sharpie is created with a default inkAmount value: 100
    We can use() the sharpie objects: using it decreases inkAmount by 10
 */
public class Sharpie {
    String color;
    int width;
    int inkAmount;

    public Sharpie() {
        this.inkAmount = 100;
    }

    public Sharpie(String color, int width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }

    public void use() {
        this.inkAmount -= 10;
    }
}
