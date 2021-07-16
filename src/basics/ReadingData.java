package basics;


import java.util.Scanner;

/* To read data from the console we have to use
 * Scanner class from java.util package
 *
 * This Scanner class provides several methods to read
 * different types of data from the console
 *
 * To read
 * boolean - nextBoolean()
 * byte - nextByte()
 * short-nextShort()
 * int - nextInt()
 * long = nextLong()
 * float - nextFloat()
 * double - nextDouble()
 * single word string - next()
 * multi word string - nextLine()
 *
 * all the above methods are instance methods so we have to create Scanner class object
 * to call those methods
 *
 * syntax to create Scanner class object is
 * Scanner scObj = new Scanner(System.in);
 *
 * here System.in informs Scanner class to read the data from the default input device
 * i.e. console in IDE
 *
 * Note:- Scanner class does not have any method to read character data
 * to read Character data we have to read a character as String and then convert that
 * string to character using charAt(int index) of String class
 *
 */
public class ReadingData {

    public static void main(String[] args) {
        // create Scanner class object
        Scanner sc = new Scanner(System.in);


        // read the boolean data
        System.out.println("enter a boolean data");
        boolean bool = sc.nextBoolean();
        System.out.println("boolean b = "+bool);

        // read the integer data
        System.out.println("enter a number");
        int i = sc.nextInt();
        System.out.println("integer i = "+i);

        // read the float data
        System.out.println("enter a float number");
        float f = sc.nextFloat();
        System.out.println("float f = "+f);


        // read the string data
        System.out.println("enter a string");
        String str = sc.next();
        System.out.println("string str = "+str);

        // read the character data
        System.out.println("enter a character");
        String str1 = sc.next();
        char ch = str1.charAt(0);
        System.out.println("character ch = "+ch);
    }


}
