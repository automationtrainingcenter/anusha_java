package methods_and_constructors;

/*
 * passing variable number of arguments to a java method
 * access_modifier return_type method_name(data_type... var_name){
 * 		statements;
 * }
 *
 * the above method accepts either 0 or more number of parameters
 */

import java.util.Arrays;

public class VarArgs {

    public static void methodOne(int... numbers){
        System.out.printf("method accepts %d number of inputs\n", numbers.length);
        for(int number : numbers) {
            System.out.println(number);
        }
    }

    public void methodTwo(String... courses) {
        System.out.printf("number of courses offered = %d\n", courses.length);
        for(String courseWords : courses) {
            String[] course = courseWords.split(" ");
            if(course.length > 1) {
                String str = "";
                for (String word : course) {
                   str += Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase() + " ";
                }
                System.out.println(str);
            }else {
                String word = course[0];
                System.out.println(Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase() );
            }
        }
    }

    /* Varargs always follows the mandatory arguments */
    public void methodThree(int i, int j, String... names){
        System.out.printf("i = %d and j = %d\n", i, j);
        System.out.println(Arrays.asList(names));
    }

    public static void main(String[] args) {
        methodOne(1, 2, 3);
        VarArgs obj = new VarArgs();
        obj.methodTwo("c", "cpp", "JAVA", "PYThon", "selenium webdriver");
        obj.methodThree(10, 20, "anusha", "teja", "John", "jefry", "dan");
    }
}
