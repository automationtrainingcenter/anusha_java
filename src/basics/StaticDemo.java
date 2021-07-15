package basics;

public class StaticDemo {
    int i;
    static int j;

    public void increment(){
        i+=1;
        j+=1;
    }

    public static void main(String[] args) {
        StaticDemo s1 = new StaticDemo();
        s1.increment();
        s1.increment();

        StaticDemo s2 = new StaticDemo();
        s2.increment();

        System.out.println("i = "+s1.i+" and j = "+s1.j);
        System.out.println("i = "+s2.i+" and j = "+s2.j);

        StaticDemo s3 = new StaticDemo();
        s3.increment();

        System.out.println("i = "+s1.i+" and j = "+s1.j);
        System.out.println("i = "+s2.i+" and j = "+s2.j);
        System.out.println("i = "+s3.i+" and j = "+s3.j);
    }

}
