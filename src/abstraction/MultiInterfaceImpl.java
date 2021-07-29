package abstraction;

public class MultiInterfaceImpl implements InterfaceOne, InterfaceTwo{

    @Override
    public void methodOne() {
        System.out.println("method one of interface one definition in impl class");
    }

    @Override
    public void methodTwo() {
        System.out.println("method two of interface tow definition in impl class");
    }
}
