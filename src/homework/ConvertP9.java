package homework;
/**Write a program to convert the upper case to lower case. */

import java.util.Scanner;

public class ConvertP9 {
    public static void main(String[] args) {
        d1();
    }

    public static void d1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String txt = sc.nextLine();
        System.out.println(txt.toLowerCase());
    }

}

