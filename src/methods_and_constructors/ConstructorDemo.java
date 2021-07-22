package methods_and_constructors;

/*
 * Constructor is a method which will have same name as class name
 *
 * Constructor is used to create an instance of the class and also to assign default
 * values to the instance variables based on their data types.
 *
 * Constructor does not have any explicit return type, because every constructor
 * returns instance of the class (memory location reference)
 *
 * Constructor might or might not have input
 *
 * based on the input we have two types of constructors
 * 1. default constructor --- constructor without any input
 * 2. parameterized constructor --- constructor with input
 *
 * if we are not writing any constructor in a class java compiler will add one
 * default constructor for every class and assigns default values for the
 * instance variables based on data type
 *
 * we can write any number of parameterized constructors within one class
 * it is known as Constructor Overloading
 * To overload a constructor we have to change
 * 1. either number of arguments
 * 2. or type of arguments
 * 3. or sequence of arguments
 *
 *
 * we can call one constructor from another constructor using "this" keyword. This concepts
 * is known as Constructor Chaining. Constructor call from another constructor must be the
 * first line of the constructor.
 *
 * "this" keyword represents current class instance.
 * "this" keyword can be used for constructor chaining as well as to differentiate
 * instance variables with local variables in a parameterized constructors and getters and setters
 *
 *
 * syntax to create default constructor
 * access_modifier(public) class_name(){
 * 		statements;
 * }
 *
 *
 * syntax to create parameterized constructor
 * access_modifier(public) class_name(arg1, arg2, arg3 .... argN){
 * 		statements;
 * }
 *
 *
 */

public class ConstructorDemo {
    int i;
    int j;

    // default constructor
    public ConstructorDemo() {
        i = 10;
        j = 20;
    }


    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo();
        System.out.println(obj.i);
        System.out.println(obj.j);

        ConstructorDemo obj1 = new ConstructorDemo();
        System.out.println(obj1.i);
        System.out.println(obj1.j);


        ConstructorDemo obj2 = new ConstructorDemo();
        System.out.println(obj2.i);
        System.out.println(obj2.j);

    }



}
