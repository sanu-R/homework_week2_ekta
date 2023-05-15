package homework;
//Write a program to calculate the area of a triangle.//

import java.util.Scanner;

public class AreaP8 {
    public static void main(String[] args) {
        c1();
    }

    public static void c1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter base width of Triangle ");
        float base = scanner.nextFloat();
        System.out.println("Please enter height of Triangle ");
        float height = scanner.nextFloat();
        float area = (base * height) / 2;
        System.out.println("Area of Triangle calculated by Java program is : " + area);


    }
}