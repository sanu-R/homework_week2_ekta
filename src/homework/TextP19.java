package homework;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */

public class TextP19 {
    public static void main(String[] args) {
        e1();
    }

    public static void e1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in Uppercase");
        String str = sc.nextLine();
        System.out.println(str.toLowerCase());
    }
}
