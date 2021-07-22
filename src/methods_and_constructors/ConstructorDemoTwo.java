package methods_and_constructors;

public class ConstructorDemoTwo {

    int id;
    String name;
    String course;
    long phNum;
    double fee;


    // default constructor
    public ConstructorDemoTwo(){
        id = 100;
        name = "anusha";
        course ="selenium";
        phNum = 9876543210L;
        fee = 12000.00;
    }

    // parameterized constructor
    public ConstructorDemoTwo(int id, String name, String course, long phNum, double fee) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.phNum = phNum;
        this.fee = fee;
    }


    public void printInfo(){
        System.out.printf("id = %d\nname = %s\ncourse = %s\nphone num = %d\nfee = %f\n", id, name, course, phNum, fee);
    }

    public static void main(String[] args) {
        ConstructorDemoTwo obj1 = new ConstructorDemoTwo();
        obj1.printInfo();
        obj1.id = 101;
        obj1.name = "Teja";
        obj1.course = "Java";
        obj1.phNum = 8765123499L;
        obj1.fee = 5000.00;
        obj1.printInfo();

        ConstructorDemoTwo obj2 = new ConstructorDemoTwo(102, "John", "Python", 6751122334L, 8000.00);
        obj2.printInfo();
    }


}
