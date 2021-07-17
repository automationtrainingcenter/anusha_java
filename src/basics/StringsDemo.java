package basics;

/*
 * String is a collection of characters
 * Strings are immutable in java that means we can't modify or change string data once
 * stored in a memory location
 * Strings will store in separate memory location known as String constant pool
 * To create mutable strings we have to use StringBuilder or StringBuffer classes
 *
 * String values must be stored using ""
 */

public class StringsDemo {

    public static void main(String[] args) {
        String s1 = "selenium";

        String s2 = "python";

        String s3 = "Selenium";


        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        s2 = "java";
        s3 = "selenium";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode()); // s2 will be stored in a different memory location than previous
        System.out.println(s3.hashCode()); // s3 will point to the same memory location as s1

        s1 = "Appium";
        System.out.println(s1.hashCode()); // s1 will point to the new memory location
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode()); // s3 will point to the same location where s1 and s3 are pointing previously

    }
}
