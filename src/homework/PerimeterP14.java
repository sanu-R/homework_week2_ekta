package homework;
/**Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
 Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20

 */

import java.util.Scanner;

public class PerimeterP14 {
    public static Scanner s = new Scanner(System.in);


    public static void main(String[] args) {
        f1();
    }

    public static void f1() {
        double l, w, perimeter, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of rectangle:");
        l = s.nextDouble();
        System.out.print("Enter width of rectangle:");
        w = s.nextDouble();
        perimeter = 2 * (l + w);
        System.out.println("Perimeter of rectangle:" + perimeter);
        area = l * w;
        System.out.println("Area of rectangle:" + area);


    }
}

