package inheritance;

public class Child extends Parent{


    public Child(){
        super(); // Parent class constructor call
        System.out.println("Child class object created");
    }

    public void methodTwo() {
        // access the Parent class method with in the child class
//        methodOne();
        System.out.println("Child class method two");
    }

    public static void method(){
        Child c = new Child();
        c.methodTwo();
//        c.methodOne();
    }
}
