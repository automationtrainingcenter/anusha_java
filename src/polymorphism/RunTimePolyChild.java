package polymorphism;

public class RunTimePolyChild extends RunTimePolyParent{

    @Override
    public void add(String a, int b) {
        System.out.println("Child class add method");
        char[] chars = a.toCharArray();
        boolean flag = true;
        for(char ch : chars) {
            if(!Character.isDigit(ch)) {
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println(Integer.parseInt(a) + b);
        }else {
            super.add(a, b);
        }
    }
}
