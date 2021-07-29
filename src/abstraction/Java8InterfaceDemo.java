package abstraction;

public interface Java8InterfaceDemo {

    // From Java 8 onwards we can create concrete methods with in an interface
    // abstract method
    public void methodOne();

    // static method
    public static void methodTwo() {
        System.out.println("static method of interface");
    }

    // default method
    public default void methodThree() {
        System.out.println("default method of interface");
    }
}
