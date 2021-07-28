package abstraction;
/*
 * Abstraction means a plan or template to create a class
 * Abstraction means hiding the implementation details of methods
 * we have two to implement abstraction
 *
 * 1. abstract classes
 * 		It is class which contains at least one abstract method and declared using "abstract" keyword.
 * Abstract method is a method with declaration only.
 * A normal Java class "extends" this abstract class and provides implementation to the abstract methods.
 * If in case this normal Java class failed to provide implementation to any one abstract method then that
 * normal Java class also becomes abstract class.
 * An abstract class can extends another abstract class or normal java class and it can implement an interface
 * Abstract class can contain both abstract methods and concrete methods.
 *
 *
 * 2. Interfaces
 * 		In interface all the methods are public and abstract by default. A normal Java class "implements"
 * interface and provides implementation to the abstract methods.
 * By default all the methods in Interface are public and abstract
 * By default all the variables of interface are public, static and final
 * An interface can extends multiple interfaces and it can't implement another interface
 * A class can implement multiple interfaces and can only extends one normal class or one abstract class
 *
 * From Java 8 onwards interface allows concrete methods
 * These concrete methods are either static methods or "default" methods
 * We can access default method using interface reference and static method using interface name
 * we can override a default method of interface in implementation classes but
 * we can't override static method of interface
 * we can't create an instance of either abstract class or interface but we can create object reference,
 *
 * Functional interfaces: These are new interfaces which were introduced in Java 8. These are enhancements
 * of SAM (Single Abstract Method) interfaces which are in below versions of Java.
 * Function interface means an interface with only one abstract method.
 *
 * we can provide definition for abstract method of Functional interface in three ways
 * 1. by using a normal java class which will implements Functional interface
 * 2. by using anonymous class
 * 3. by using lambda expressions
 *
 * lambda expressions:
 * (parameters) -> { statements; };
 * 1. method without input and without output
 * void add(){
 * 		System.out.println(2+3);
 * }
 *
 * () -> System.out.println(2+3);
 * or
 * () -> {
 * 		System.out.println(2+3);
 * };
 *
 * 2. method with input and without output
 * void add(int a, int b){
 * 		System.out.println(a+b);
 * }
 *
 * (int a, int b) -> System.out.println(a+b);
 *
 *
 * 3. method without input and with output
 * int add(){
 * 		return 5;
 * }
 *
 * () -> 5;
 * or
 * () -> { return 5; };
 *
 * 4. method with input with ouptut
 * int add(int a, int b){
 * 		return a+b;
 * }
 *
 * (int a, int b) -> return a+b;
 * or
 * (int a, int b) -> {
 * 		return a+b;
 * };
 *
 *
 */
public class AbstractionDemo {

    public static void main(String[] args) {
        // Create an object of Abstract class
//        AbstractClassDemo obj = new AbstractClassDemo(); // not possible to create an object of the abstract class
        // Create an object of implementation class of abstract class
        AbstractClassImpl obj = new AbstractClassImpl();
        obj.methodOne();
        obj.methodTwo();

        // create an object reference to the parent abstract class and object creation to the child implementation class
        AbstractClassDemo pObj = new AbstractClassImpl();
        pObj.methodOne();
        pObj.methodTwo();

        // create an object reference to the interface and object creation to the implmentation class
        InterfaceDemo iObj = new InterfaceImpl();
        iObj.methodOne();
        iObj.methodTwo();

    }

}
