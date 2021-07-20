package methods_and_constructors;

/*
 * Methods:
 * Method is a collection of statement or group of statements which are combined together
 * to perform specific task.
 *
 * The purpose of the methods are code reusability
 *
 * every method mainly contains 3 parts
 * 1. method declaration or method head
 * 2. method definition or method body
 * 3. method call
 *
 * syntax to create a method
 * access_modifier static (optional)  return_type method_name(arg1, arg2 ... argN){
 * 		statements; (method body)
 * }
 *
 * syntax to call a method
 * return_type_data_type var_name = method_name(para1, para2, .... paraN);
 *
 *
 * Here arguments in method declaration are variables to accept input and return_type is
 * the output from the method. If method have any output then we have to add
 * return statement to the method body. If method does not have any output then
 * return type in method declaration is void.
 *
 * parameters in method call are input to the method and var_name holds the output of the method
 *
 *
 * Based on input and output we can divide methods into 4 types
 * 1. method without input and without output
 * 2. method without input and with output
 * 3. method with input and without output
 * 4. method with input and with output
 */

import java.util.Locale;

public class MethodsDemo {

    // method without input and without output
    public void methodOne() {
        System.out.println("this is method without input and without output");
    }

    // method without input and with output
    public boolean methodTwo() {
        System.out.println("method without input and with output");
        System.out.println("this method returns boolean output");
        return true;
    }

    // method with input and without output
    public void methodThree(String str) {
        System.out.println("method with input and without output");
        System.out.println("this method is accepting string input");
        System.out.println("input str = "+str.toUpperCase());
    }

    // method with input and with output
    public int methodFour(int a, int b){
        System.out.println("method with input and with output");
        System.out.println("this method accepting two inputs");
        System.out.printf("input a = %d and b = %d", a, b);
        int sum = a+b;
        return sum;
    }


    public static void main(String[] args) {
        // create an object of this class so that we can call instance methods of this class
        MethodsDemo obj = new MethodsDemo();
        obj.methodOne();
        boolean r1 = obj.methodTwo();
        System.out.println("r1 = "+r1);
        obj.methodThree("anusha");
        int r2 = obj.methodFour(10, 20);
        System.out.println("r2 = "+r2);
    }


}
