package polymorphism;
/*
 * Polymorphism means one object behaving differently based on input or based on environment
 *
 * We have two types of polymorphism
 *
 * 1. Compile time polymorphism:
 * 	it is also known as method overloading
 * We can achieve method overloading within a class either
 * 1. by changing number of inputs of a method or
 * 2. by changing type of inputs
 * 3. by changing sequence of inputs
 *
 * Note: By changing only the return type of a method we can't achieve method overloading
 *
 * 2. Runtime polymorphism:
 * 	it is also known as method overriding
 * 	we can achieve method overriding using inheritance. We can override a method of parent class within
 * child class.
 *
 */
public class PolymorphismDemo {

    public static void main(String[] args) {
        CompileTimePoly cobj = new CompileTimePoly();
        cobj.add(10, "20");
        cobj.add(10, 20);
        cobj.add("20", 10, 10);
        cobj.add("20", 10);

        RunTimePolyParent rp = new RunTimePolyParent();
        rp.add("10", 20);

        RunTimePolyChild rc = new RunTimePolyChild();
        rc.add("abc", 20);

        RunTimePolyParent rpc = new RunTimePolyChild();
        rpc.add("20", 30);
    }
}
