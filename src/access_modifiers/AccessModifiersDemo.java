package access_modifiers;
/*
 * Access modifiers are the keywords which are used to define the scope
 * of variables or methods or classes.
 *
 * there are 4 access modifiers in java
 * 1. public: we access these every where with in java world without any restrictions
 * 2. private: we can access these within the class only, outside the class we can not access them
 * 3. default: we can access these within the package level, we can't access outside of the package
 * 		Note: if we are not specifying any access modifier like public or private or protected then that
 * 	is default access modifier.
 * 4. protected: same as default i.e. package level. But we can access protected variable outside the package using
 * Child class objects.
 */
public class AccessModifiersDemo {

    public int pVar = 10;
    private int prVar = 20;
    int dVar = 30;
    protected int proVar = 40;

    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();
        System.out.println(obj.pVar);
        System.out.println(obj.prVar);
        System.out.println(obj.dVar);
        System.out.println(obj.proVar);
    }

}
