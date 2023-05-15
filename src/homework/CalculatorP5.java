package homework;

/**Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.) */

import java.util.Scanner;

public class CalculatorP5 {
   public static Scanner obj = new Scanner(System.in);
    public static void main(String[] args) {
        addition();
        subtraction();
        CalculatorP5 obj = new CalculatorP5();
        obj.division();
        obj.multiplication();

    }
public static void addition (){ //static method
    System.out.println("Enter First Value");
    int a = obj.nextInt();
    System.out.println("Enter Second Value");
    int b = obj.nextInt();
    int answer = a + b;
    System.out.println("Addition of First and Second Value " +answer);

}
public static void subtraction(){ //static methods
    System.out.println("Enter First Value");
    int a = obj.nextInt();
    System.out.println("Enter Second Value");
    int b = obj.nextInt();
    int answer = a - b;
    System.out.println("Subtraction of First and Second Value " +answer);



}
public void multiplication(){ //Instance method
    System.out.println("Enter First Value");
    int a = obj.nextInt();
    System.out.println("Enter Second Value");
    int b = obj.nextInt();
    int answer = a * b;
    System.out.println("Multiplication of First and Second Value" +answer);


}
public void division(){ //Instance method
    System.out.println("Enter First Value");
    int a = obj.nextInt();
    System.out.println("Enter Second Value");
    int b = obj.nextInt();
    int answer = a / b;
    System.out.println("Division of First and Second value" +answer);



}
}
