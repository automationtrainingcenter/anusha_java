package polymorphism;

public class CompileTimePoly {

    public void add(String a, int b) {
        System.out.println(a+b);
    }

    // change in type of input
    public void add(int a, int b) {
        System.out.println(a+b);
    }

    // change in number of inputs
    public void add(String a, int b, int c) {
        System.out.println(a+b+c);
    }

    // change in sequence of inputs
    public void add(int a, String b) {
        System.out.println(a+b);
    }

    // by changing the return type of method we can't achieve method overloading
//    public int add(String x, int y) {
//
//    }


}
