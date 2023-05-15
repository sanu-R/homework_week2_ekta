package homework;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */

public class BinaryP16 {
    public static Scanner obj = new Scanner(System.in);

    public static void main(String[] args) {
        c2();

    }

    public static void c2() {

        System.out.println("Input first binary number");
        String a = obj.nextLine();
        System.out.println("Input second binary number");
        String b = obj.nextLine();
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int result = num1 + num2;
        System.out.println("Sum of two binary numbers");

        System.out.println(Integer.toBinaryString(result));

    }
}

