package basics;
/*
 * Conditional statements are the statements which contains conditional operators or combination
 * of conditional and logical operators
 *
 * These are used to execute a block of statements based on some condition or expression
 *
 * ******** if ************
 * if(expression){
 * 		statements
 * }
 * if the expression true then the statements inside if block will be executed.
 *
 *
 * ************ if-else ************
 * if(expression){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if the expression is true the statements inside if block will be executed else statements
 * inside else block will be executed
 *
 *
 * ************ else if ladder ************
 * if(expression 1){
 * 		statements;
 * }else if(expression 2){
 * 		statements;
 * }else if(expression 3){
 * 		statements;
 * }
 * .
 * .
 * .
 * }else if(expression n){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if expression 1 is true it will execute statements inside if block else if will expression 2 and
 * if expression 2 is true it will execute statements inside expression 2 else if block else if will
 * verify next expression. if all the expressions are false then it will execute statements inside
 * else block
 *
 *
 * ************ nested if ************
 * if(expression 1){
 * 		if(expression 2{
 * 			statements;
 * 		}else{
 * 			statements;
 * 		}
 * }else{
 * 		statements;
 * }
 *
 *
 * ************ switch case: it will work based on value ************
 * switch(Value){
 * 		case value1;
 * 			statements;
 * 			break;
 * 		case value2:
 * 			statements;
 * 			break;
 * 		.
 * 		.
 * 		.
 * 		case valueN:
 * 			statements;
 * 			break;
 * 		default:
 * 			statements;
 * }
 *
 * facebook
 * 1. launch the app
 * 2. enter username
 * 3. enter password
 * 4. click on login button
 *
 * if username valid and password valid
 *      then do login
 * else
 *     display error message
 *
 *
 * gmail
 * 1. launch the app
 * 2. enter username
 * 3. click on next
 * 4. enter password
 * 5. click on login
 *
 * if username valid
 *      then read password
 *      if password valid
 *          then do login
 *      else
 *          display invalid password
 * else display invalid username
 *
 */

import java.util.Locale;

public class ConditionalStatements {

    public static void main(String[] args) {
        // simple if
        // verify a given number is positive
        int num = -3000;
        if (num >= 0) {
            System.out.println("Given number is positive");
        }

        // if else
        // if given string contains even number of characters then convert that string to uppercase or to lowercase
        String s = "Anusha";
        if (s.length() % 2 == 0) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }

        // else if ladder
        // verify bigger number in given two numbers
        // unittest: branch coverage: cyclomatic complexity
        int i1 = 10;
        int i2 = 100;

        if (i1 > i2) {
            System.out.println("i1 is bigger");
        } else if (i2 > i1) {
            System.out.println("i2 is bigger");
        } else {
            System.out.println("both are same");
        }

        // nested if
        if (i1 != i2){
            if (i1 > i2) {
                System.out.println("i1 is greater");
            } else {
                System.out.println("i2 is greater");
            }
        } else {
            System.out.println("both are equal");
        }

        // switch case
        String level = "Level1";
        switch (level.toLowerCase()){
            case "level1":
                System.out.println("instructions");
                System.out.println("hints");
                System.out.println("easy mode");
                break;
            case "level2":
                System.out.println("limited hints");
                System.out.println("medium mode");
                break;
            case "level3":
                System.out.println("hard mode");
                break;
            default:
                System.out.println("invalid level selection");
        }




    }
}
