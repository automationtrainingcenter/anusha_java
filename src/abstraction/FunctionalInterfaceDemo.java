package abstraction;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

    // contains only one abstract method
    void methodOne();

    static void methodTwo(){
        System.out.println("static method");
    }

    default void methodThree() {
        System.out.println("default method");
    }
}
