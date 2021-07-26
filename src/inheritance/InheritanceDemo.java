package inheritance;
/*
 * Acquiring properties and methods of one class (super or parent or base) in
 * another class (child or sub)
 *
 * The purpose of inheritance is code reusability
 *
 * To achieve inheritance we are going to use extends keyword
 * child class extends parent class
 *
 * class Child extends Parent{ }
 *
 * There are 5 types of inheritance
 *
 * 1. single
 * 2. multilevel
 * 3. hierarchical
 * 4. multiple
 * 5. hybrid
 *
 * Java supports only 1, 2 and 3 types of inheritance and it does not support
 * multiple and hybrid inheritance
 *
 * single: single parent and single child
 *
 * class A {
 *  public methodOne(){}
 * }
 *
 * class B extends A{
 * 	public methodTwo(){ }
 * }
 *
 *
 * A a = new A();
 * a.methodOne();
 *
 *
 * B b = new B();
 * b.methodTwo();
 * b.methodOne();
 *
 *
 *
 * 2. Multilevel: Parent and it's child and it's child and so on
 * Parent -> Child -> GrandChild
 *
 * class A {
 *  	public methodOne(){}
 * }
 *
 * class B extends A{
 * 		public methodTwo(){ }
 * }
 *
 * class C extends B {
 * 		public methodThree(){ }
 * }
 *
 * A a = new A();
 * a.methodOne();
 *
 * B b = new B();
 * b.methodTwo();
 * b.methodOne();
 *
 * C c = new C();
 * c.methodThree();
 * c.methodTwo();
 * c.methodOne();
 *
 * 3. Hierarchical: single parent and multiple child
 * Parent -> ChildOne and Parent -> ChildTwo
 *
 * class A{
 * 		public methodOne(){ }
 * }
 *
 *
 * class B extends A{
 * 		public methodTwo(){ }
 * }
 *
 * class C extends A{
 * 		public methodThree(){ }
 * }
 *
 *
 * A a = new A();
 * a.methodOne();
 *
 * B b = new B();
 * b.methodTwo();
 * b.methodOne();
 * b.methodThree(); error
 *
 * C c = new C();
 * c.methodThree();
 * c.methodOne();
 * c.methodTwo(); error
 *
 *
 * 4. Multiple: multiple parent and single child
 * ParentOne -> Child and ParentTwo -> Child
 *
 * class A{
 * 		public methodOne(){ }
 *
 * 		public method() { }
 * }
 *
 * class B{
 * 		public methodTwo(){ }
 *
 * 		public method(){ }
 * }
 *
 * class C extends A, B // error
 *
 * 5. Hybrid: combination of hierarchical and multiple
 * Parent -> ChildOne and Parent -> ChildTwo and SubChild -> ChildOne, ChildTwo
 *
 *
 */

public class InheritanceDemo {

    public static void main(String[] args) {
       // creating object of Parent class
        Parent p = new Parent();
        p.methodOne();

        // Creating object of Child class object
        Child c = new Child();
        c.methodTwo(); // Child class
        c.methodOne(); // Parent class

        // create an object of SubChild Class
        SubChild sc = new SubChild();
        sc.methodThree(); // SubChild
        sc.methodTwo(); // Child
        sc.methodOne(); // Parent

        // create an object of ChildOne class
        // ChildOne -> Parent as well as Child -> Parent
        ChildOne co = new ChildOne();
        co.methodFour(); // ChildOne
        co.methodOne(); // Parent
//        co.methodTwo(); // Child --- is not possible
        // Parent class with properties and parameterized constructor
        ChildProperties cp = new ChildProperties(101, "Anusha", "London", "gfhv1123f");
        cp.print();

        /*
        Whenever we create an object of child class using Child class constructor it will create
        an object for both Child and Parent classes.

        we can create an object reference to the parent class and object creation to any of the child classes
         */

        Parent pc = new Child();
        pc.methodOne();
        Child cObj = (Child) pc;
        cObj.methodTwo();

    }

}
