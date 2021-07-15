package basics;

// Student class
public class InstanceVsStatic {

    int id = 1;
    String name = "Surya";
    String phoneNum = "0000000000";
    static String collegeName = "jntu";


    public static void main(String[] args) {
        System.out.println(collegeName);

        // student 1
        InstanceVsStatic s1 = new InstanceVsStatic();
        s1.id = 10;
        s1.name = "John";
        s1.phoneNum = "987654321";
        System.out.println("id = "+s1.id+"\nname = "+s1.name+"\nphone num = "+s1.phoneNum+"\ncollege name = "+s1.collegeName);

        // student 2
        InstanceVsStatic s2 = new InstanceVsStatic();
        System.out.println("id = "+s2.id+"\nname = "+s2.name+"\nphone num = "+s2.phoneNum+"\ncollege name = "+s2.collegeName);

        s1.collegeName = "MIT";
        s2.id = 11;
        s2.name = "Anusha";
        s2.phoneNum = "1235467898";
        System.out.println("id = "+s1.id+"\nname = "+s1.name+"\nphone num = "+s1.phoneNum+"\ncollege name = "+s1.collegeName);
        System.out.println("id = "+s2.id+"\nname = "+s2.name+"\nphone num = "+s2.phoneNum+"\ncollege name = "+s2.collegeName);

        InstanceVsStatic s3 = new InstanceVsStatic();
        System.out.println("id = "+s3.id+"\nname = "+s3.name+"\nphone num = "+s3.phoneNum+"\ncollege name = "+s3.collegeName);
    }


}
