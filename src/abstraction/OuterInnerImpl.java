package abstraction;

// we can access inner interface using outer interface name
public class OuterInnerImpl implements Outer, Outer.Inner {
    @Override
    public void omethod() {
        System.out.println("outer interface method definition");
    }

    @Override
    public Inner method() {
        return this;
    }


    @Override
    public void imethod() {
        System.out.println("inner interface method definition");
    }
}
