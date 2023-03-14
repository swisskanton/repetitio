import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid.
        //
        // Set the 3 sides to 10.4, 13.5, 8.2 and your program should
        // produce the following output:
        //
        // Surface Area: 672.76
        // Volume: 1151.28
        double a, b, c, area, volume;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the 1. side of the cuboid.");
        a = scanner.nextDouble();
        System.out.println("Please, enter the 2. side of the cuboid.");
        b = scanner.nextDouble();
        System.out.println("Please, enter the 3. side of the cuboid.");
        c = scanner.nextDouble();
        area = 2 * ((a * b) + (b * c) + (c * a));
        volume = a * b * c;
        System.out.printf("Surface Area: %.2f %nVolume: %.2f", area, volume);
    }
}
