package abstraction;

// inner interface
public interface Outer {

    void omethod();

    interface Inner {
        void imethod();
    }

    Inner method();
}
