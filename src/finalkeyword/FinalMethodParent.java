package finalkeyword;

public class FinalMethodParent {

    public void methodOne() {
        System.out.println("Parent class normal method");
    }

    public final void methodTwo() {
        System.out.println("Parent class final method");
    }
}
