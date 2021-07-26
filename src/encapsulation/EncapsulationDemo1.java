package encapsulation;

import methods_and_constructors.ConstructorDemoTwo;

public class EncapsulationDemo1 {
    public static void main(String[] args) {
        EncapsulationDemo obj1 = new EncapsulationDemo(101, "anusha", "Software Tester", 35000.00, "London Road", "jjkkl9876f");
        obj1.printInfo();
        obj1.setPanNum("ggcd2345j");
        obj1.printInfo();
        obj1.setPanNum("qazxx3322v");
        obj1.printInfo();
    }


}
