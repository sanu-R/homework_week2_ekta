package homework;

/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme
 */

public class InstanceStaticP3 {
    int a = 3;
    static int b = 4;

    public static void main(String[] args) {
        InstanceStaticP3 obj = new InstanceStaticP3();
        obj.k1();
        k2();
    }

    public void k1() { //instance method
        System.out.println(a);
        System.out.println(b);
    }

    public static void k2() { // static method
        InstanceStaticP3 obj1 = new InstanceStaticP3();
        System.out.println(obj1.a);
        System.out.println(b);
    }
}
