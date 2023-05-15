package homework;
/** Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme.
*/

public class Programme2 {
    static int b = 12;//static variable
    static int c = 10;//static variable

    public static void main(String[] args) {
        k1(); //direct calling

    }

    public static void k1() { //static method
        System.out.println(b);
        System.out.println(c);
    }

}