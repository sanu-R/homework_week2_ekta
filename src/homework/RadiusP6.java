package homework;
/** Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).*/

import java.util.Scanner;

public class RadiusP6 {

    public static void main(String[] args) {
        k1();
    }
    public static void k1() {
        double radius, area;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Radius of Circle:");
        radius = in.nextDouble();
        area = Math.PI * radius * radius;
        System.out.println("Area of Circle : " + area);
    }

}
