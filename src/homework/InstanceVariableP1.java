package homework;

/**
 * 1. Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */

public class InstanceVariableP1 {
    int b = 5; // Instance Variable
    int c = 10; // Instance variable

    public static void main(String[] args) { //main method
        InstanceVariableP1 obj = new InstanceVariableP1();
        obj.k1(); //calling method
    }

    public void k1() {//instance method
        System.out.println(b);
        System.out.println(c);
    }


}

