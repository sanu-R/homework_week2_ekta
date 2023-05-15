package homework;
/** Write a Java program to convert a decimal number to binary number.
 *Input Data:
 * Input a Decimal Number : 5
 *Expected Output
 *Binary number is: 101

 */


import java.util.Scanner;

public class DecimalP17 {
    public static void main(String[] args) {
        m1();

    }

    public static void m1() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Input a decimal number");
        int dec = obj.nextInt();

        String bin = Integer.toBinaryString(dec);
        System.out.println("Binary number is " + bin);

    }
}
