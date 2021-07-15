package basics;

public class VariableDemo1 {

    public static void main(String[] args) {
        // accessing instance variable outside the class
        VariablesDemo obj = new VariablesDemo();
        obj.iVar = 100;
        System.out.println("instance variable iVar = "+obj.iVar);


        // accessing static variable outside the class
        VariablesDemo.sVar = 9000;
        System.out.println("static variable sVar = "+ VariablesDemo.sVar);

    }
}
