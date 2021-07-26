package finalkeyword;

public class FinalMethodChild extends FinalMethodParent{

    @Override
    public void methodOne() {
        System.out.println("Child class override Parent class method one");
    }

//    @Override
//    public void methodTwo() {
//
//    }

    // we can not override the final method

}
