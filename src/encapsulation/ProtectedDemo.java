package encapsulation;

import access_modifiers.AccessModifiersDemo;

public class ProtectedDemo extends AccessModifiersDemo{

    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();
        System.out.println(obj.pVar);
//        System.out.println(obj.prVar);  // Private variables are not accessible outside the class
//        System.out.println(obj.dVar); // default variables are not accessible outside the package
//        System.out.println(obj.proVar); // protect variables are not accessible outside the package

        ProtectedDemo pObj = new ProtectedDemo();
        System.out.println(pObj.pVar);
//        System.out.println(pObj.prVar);  // Private variables are not accessible outside the class
//        System.out.println(pObj.dVar); // default variables are not accessible outside the package
        System.out.println(pObj.proVar); // protect variables are not accessible outside the package using parent class reference but we can access using child class reference
    }
}
