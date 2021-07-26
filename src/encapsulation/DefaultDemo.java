package encapsulation;

import access_modifiers.AccessModifiersDemo;

public class DefaultDemo {

    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();
        System.out.println(obj.pVar);
//        System.out.println(obj.prVar);  // Private variables are not accessible outside the class
//        System.out.println(obj.dVar); // default variables are not accessible outside the package
//        System.out.println(obj.proVar); // protect variables are not accessible outside the package
    }
}
