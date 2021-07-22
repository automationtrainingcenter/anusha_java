package methods_and_constructors;

public class MainArgs {

    // arguments we have to pass separated by space not with comma
    public static void main(String[] args) {
        System.out.printf("number of arguments to main method = %d\n",args.length);
        for(String arg : args){
            System.out.println(arg);
        }

    }
}
