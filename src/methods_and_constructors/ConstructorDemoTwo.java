package methods_and_constructors;

public class ConstructorDemoTwo {

    int id;
    String name;
    String course;
    long phNum;
    double fee;
    String email;
    int pincode;


    // default constructor
    public ConstructorDemoTwo(){
        this(100, "anusha", "selenium", 9876543210L, 12000.00, "", 500050);
    }

    // parameterized constructor
    public ConstructorDemoTwo(int id, String name, String course, long phNum, double fee) {
        this(id, name, course, phNum, fee, "", 500050);
    }

    public ConstructorDemoTwo(int id, String name, String course, long phNum, double fee, String email) {
        this(id, name, course, phNum, fee, email, 500050);
    }

    public ConstructorDemoTwo(int id, String name, String course, long phNum, double fee, int pincode) {
        this(id, name, course, phNum, fee, "", pincode);
    }

    public ConstructorDemoTwo(int id, String name, String course, long phNum, double fee, String email, int pincode) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.phNum = phNum;
        this.fee = fee;
        this.email = email;
        this.pincode = pincode;
    }


    public void printInfo(){
        System.out.printf("id = %d\nname = %s\ncourse = %s\nphone num = %d\nfee = %f\nemail = %s\npincode = %d\n", id, name, course, phNum, fee, email, pincode);
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

        ConstructorDemoTwo obj3 = new ConstructorDemoTwo(103, "Jefry", "Python", 9988812345L, 6000.00, "jefry@gmail.com");
        obj3.printInfo();

        ConstructorDemoTwo obj4 = new ConstructorDemoTwo(104, "Dan", "Django", 8833312399L, 16000.00, 500085);
        obj4.printInfo();

        ConstructorDemoTwo obj5 = new ConstructorDemoTwo(105, "Tom", "Flask", 8976611223L, 16000.00, "tom@gmail.com", 500010);
        obj5.printInfo();
    }


}
