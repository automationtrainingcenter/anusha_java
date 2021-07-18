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
    }
}
