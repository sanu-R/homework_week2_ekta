package homework;
/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */

import java.util.Scanner;

public class InputP10 {
    public static void main(String[] args) {
        c1();
    }

    public static void c1() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num1 = obj.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(num1 + " x " + (i + 1) + " = " +
                    (num1 * (i + 1)));

        }
    }
}