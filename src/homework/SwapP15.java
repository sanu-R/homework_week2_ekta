package homework;
//Write a Java program to swap two variables. //

import java.util.Scanner;

public class SwapP15 {
    public static void main(String[] args) {
        k2();
    }

    public static void k2() {
        Scanner s = new Scanner(System.in);
        int x = 400, y = 800;
        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
