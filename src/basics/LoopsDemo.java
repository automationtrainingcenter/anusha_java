package basics;
/*
 * Loops are used to execute a block of statements repeatedly based on some
 * condition. Each and every repetition is known as an iteration.
 *
 * Java contains mainly 4 loops
 * 1. while
 * 2. do while
 * 3. for
 * 4. for each
 * here for each loop is used to iterate over a collection of data like
 * arrays, It is not condition based loop
 *
 * every loop (except for each) contains mainly 3 parts
 * 1. initialization
 * 2. condition or expression
 * 3. increment or decrement
 *
 *while loop:
 *
 *initialize;
 *
 *while(condition or expression){
 *	statements which we want to repeat;
 *	increment or decrement
 *}
 *
 *the minimum number of iterations in while loop is 0
 *
 *do while loop:
 *
 *initialize;
 *
 *do{
 *	statements we want to repeat
 *	increment or decrement
 *}
 *while(condition or expression);
 *the minimum number of iterations in do while loop is 1
 *
 *
 *for loop:
 *
 *for(initialization; condition or expression; increment or decrement){
 *	statements we want to repeat;
 *}
 *the minimum number of iterations in for loop is 0
 *
 *for each loop:
 *
 *for(collection_data_type var_name : collection_varaible_name){
 *	statements to repeat;
 *}
 *
 *the minimum number of iterations in for each loop is 0
 *
 *to stop infinite loop, press ctrl + c in command prompt
 *or we can click stop button in eclipse or Intellij console
 *
 *
 *break -- it is a statement which is used to terminate loop block
 *continue -- it is a statement which will skip the current iteration and continues next iterations
 */


import java.util.Locale;
import java.util.Scanner;

public class LoopsDemo {

    public static void main(String[] args) {
        // print number from 1 to 10
        // while loop
        int i = 1; // initialization
        while (i < 11) /* condition */ {
            System.out.println(i);
            i += 1; // increment
        }

        // print numbers from 20 to 10 (excluded)
        // do while
        int j = 20;
        do {
            System.out.println(j);
            j -= 1;
        } while (j > 10);

        // print even numbers from 1 to 20
        for(int k = 1; k < 21; k++){
            if (k % 2 == 0) {
                System.out.println(k);
            }
        }

        int num = 3;
        // print 5 table
        for (int l = 1; l < 11; l++){
            System.out.println(String.format("%d * %d = %d", l, num, l * num));
        }

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        // print all the chars in uppercase
        for (char vowel : vowels) {
            System.out.println(Character.toUpperCase(vowel));
        }

        // break statement
        for (int l = 0; l < 10; l++){
            if (l == 5){
                break; // terminates the loop
            }
            System.out.print(l + " ");
        }
        System.out.println("End of for loop with break");


        // continue statement
        for (int l = 0; l < 10; l++){
            if (l == 5){
                continue; // skip the iteration, go to next iteration
            }
            System.out.print(l + " ");
        }
        System.out.println("End of for loop with continue");

        // prime number
        num = 113;
        boolean status = true;
        for (int n = 2; n <= num/2; n++){
            if (num % n == 0){
                System.out.println(String.format("%d is not prime and it is divisible with %d times %d", num, n, num/n));
                status = false;
                break;
            }
        }
        if (status) {
            System.out.println(String.format("%d is prime", num));
        }

        //  reverse the given string or verify given string is palindrome or not
        String str = "Madam";
        String rstr = "";
        for (int n = str.length()-1; n >=0 ; n--){
            rstr += str.charAt(n);
        }
        System.out.println(rstr);
        if(rstr.equalsIgnoreCase(str)){
            System.out.println("Given string is palindrome");
        } else {
            System.out.println("Given string is not palindrome");
        }

        // given number is palindrome
        int aNum = 12221;
        int rNum = 0;
        num = aNum;
        while (num != 0){
            int r = num % 10;
            rNum = rNum * 10 + r;
            num = num / 10;
        }
        if (aNum == rNum) {
            System.out.println("Given number is palindrome");
        } else {
            System.out.println("Given number is not palindrome");
        }

        // remove duplicates from string
        String s1 = "prakash";
        String sNoDupes = "";
        for (int n = 0; n < s1.length(); n++){
            char ch = s1.charAt(n);
            /*if (!sNoDupes.contains(Character.toString(ch))) {
                sNoDupes += ch;
            }*/
            if (sNoDupes.indexOf(ch) < 0){
                sNoDupes += ch;
            }
        }
        System.out.println(sNoDupes);

        // print prime number from 10 to 100
        for (int r = 10; r < 20; r++){ // outer loop which will iterate over numbers 10 to 100
            boolean flag = true;
            for (int n = 2; n <= r/2; n++){ // inner loop which will iterate from 2 to half of the number from outer loop
                if (r % n == 0){
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(String.format("%d ", r));
            }
        }

        // read string from the console until you entered a string as exit
        Scanner sc = new Scanner(System.in);
        String s = "";
        /*do {
            System.out.println("enter some string");
            s = sc.next();
            if(!s.equalsIgnoreCase("exit")) {
                System.out.println(String.format("String s is %s", s.toUpperCase()));
            }
        } while (!s.equalsIgnoreCase("exit"));*/
        do {
            System.out.println("enter some string");
            s = sc.next();
            if(s.equalsIgnoreCase("exit")){
                break;
            }
            System.out.println(String.format("string s is %s", s.toUpperCase()));
        } while (true);

        // read the string until you entered a string as exit, swap the case of give string
        // Anusha = aNUSHA
        while (true) {
            System.out.println("enter some string");
            s = sc.next();
            if (s.equalsIgnoreCase("exit")){
                break;
            }
            String swapCase = "";
            for (int n = 0; n < s.length(); n++) {
                char ch = s.charAt(n);
                char c;
                if (Character.isUpperCase(ch)) {
                   c = Character.toLowerCase(ch);
                } else if (Character.isLowerCase(ch)) {
                    c = Character.toUpperCase(ch);
                } else {
                    c = ch;
                }
                swapCase += c;
            }
            System.out.println("String after swapping the case is "+swapCase);
        }




    }
}
