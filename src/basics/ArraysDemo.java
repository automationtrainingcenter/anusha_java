package basics;
/*
 * Array is a collection of values of similar data type of fixed size. Arrays will store the information in
 * continuous memory locations. We can access array data by index values and this index value starts
 * with 0.
 *
 * Advantages of arrays over normal variables
 * 1. We can easily store multiple values using single array variable
 * 2. Array data can be accessed easily
 * 3. Sorting and searching of data is easy
 *
 * There are two types of arrays
 * 1. 1-D arrays
 * 		which will have one row and multiple columns of data
 *
 *
 * 		//declaration
 * 		data_type[] var_name = new data_type[length];
 *
 * 		//assigning data
 * 		var_name[index] = value;
 *
 * 		//retrieve data
 * 		var_name[index];
 *
 * 		//initialize
 * 		data_type[] var_name = {value0, value1, value2 .... valueN}
 *
 * 2. 2-D arrays
 * 		which will store data in multiple rows and multiple columns
 * 		//declaration
 * 		data_type[][] var_name = new data_type[row_length][column_length];
 *
 * 		//assign data
 * 		var_name[row_index][column_index] = value;
 *
 * 		//retrieve data
 * 		var_name[row_index][column_index];
 *
 * 		//initialize
 * 		data_type[][] var_name = {{r0v1, r0v2, r0v3 ... r0vN},
 * 								  {r1v1, r1v2, r1v3 ... r1vN },
 *
 * 								  {rMv1, rMv2, rMv3 ... rMvN}}
 */

public class ArraysDemo {

    public static void main(String[] args) {
        // 1D array declaration
        int[] numbers = new int[6];

        // find the number of items in an array
        System.out.println(numbers.length);


        // retrieve the data from array
        System.out.println("After declaration without assigning any values");
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[4]);
//        System.out.println(numbers[5]);
        // retrieve data using normal for loop
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        // store the values
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        numbers[5] = 60;

        System.out.println("After assigning values");
        // retrieve the data using for each loop
        for (int number : numbers) {
            System.out.println(number);
        }

        // 1D array initialization
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

//        System.out.println(vowels[0]);
//        System.out.println(vowels[1]);
//        System.out.println(vowels[2]);
//        System.out.println(vowels[3]);
//        System.out.println(vowels[4]);
        for (char vowel : vowels) {
            System.out.println(vowel);
        }


        // 2D array declaration
        int[][] m1 = new int[2][2];

        // store the values in m1 array
        /*
            0: 1:
        0: 00 01
        1: 10 11
         */
        m1[0][0] = 1;
        m1[0][1] = 0;
        m1[1][0] = 0;
        m1[1][1] = 1;


        // retrieve the data from m1 array
//        System.out.print(m1[0][0]+ " "); // first row first column
//        System.out.println(m1[0][1]); // first row second column
//        System.out.print(m1[1][0] + " "); // second row first column
//        System.out.println(m1[1][1]); // second row second column

        // retrieve the data using normal for loop
        for (int r = 0; r < m1.length; r++) {
            for (int c = 0; c < m1[r].length; c++) {
                System.out.print(m1[r][c] +" ");
            }
            System.out.println();
//            System.out.println(String.format("m1[%d] = %d", r, m1[r].length));
        }


        // 2D array initialization
        int[][] m2 = {{1,2,3}, {4,5,6}, {7,8,9}};

        // number of items in a m2 array
        System.out.println("number of items in m2 = "+m2.length);
        for (int r = 0; r < m2.length; r++) {
            System.out.println(String.format("number of items in 1st 1D array of m2 i.e m2[%d]= %d", r, m2[r].length));
        }
//        System.out.println("number of items in 1st 1D array of m2 i.e m2[0]= "+m2[0].length);
//        System.out.println("number of items in 2nd 1D array of m2 i.e m2[1]= "+m2[1].length);
//        System.out.println("number of items in 3rd 1D array of m2 i.e m2[2]= "+m2[2].length);

        // retrieve the data from m2 array
        // first row data
//        System.out.print(m2[0][0] + " ");
//        System.out.print(m2[0][1] + " ");
//        System.out.print(m2[0][2] + "\n");
//        // second row data
//        System.out.print(m2[1][0] + " ");
//        System.out.print(m2[1][1] + " ");
//        System.out.print(m2[1][2] + "\n");
//        // third row data
//        System.out.print(m2[2][0] + " ");
//        System.out.print(m2[2][1] + " ");
//        System.out.print(m2[2][2] + "\n");

        for (int r = 0; r < m2.length; r++) {
            for (int c = 0; c < m2[r].length; c++) {
                System.out.print(m2[r][c] +" ");
            }
            System.out.println();
//            System.out.println(String.format("m2[%d] = %d", r, m2[r].length));
        }

        // retrieve the data using for each loop
        System.out.println("For Each Loop");
        for (int[] oneDarr : m2) {
            for (int item : oneDarr){
                System.out.print(item +"\t");
            }
            System.out.println();
        }

        // 2D array with unequal of columns in rows
        int[][] m3 = {{1,2}, {3,4,5,6}, {7,8,9}};

        // number of items in a m2 array
        System.out.println("number of items in m3 = "+m3.length);
        for (int r = 0; r < m3.length; r++) {
            System.out.println(String.format("number of items in 1st 1D array of m2 i.e m3[%d]= %d", r, m3[r].length));
        }

        // retrieve the data from m3 array
        // first row data
//        System.out.print(m3[0][0] + " ");
//        System.out.print(m3[0][1] + "\n");
//        // second row data
//        System.out.print(m3[1][0] + " ");
//        System.out.print(m3[1][1] + " ");
//        System.out.print(m3[1][2] + " ");
//        System.out.print(m3[1][3] + "\n");
//        // third row data
//        System.out.print(m3[2][0] + " ");
//        System.out.print(m3[2][1] + " ");
//        System.out.print(m3[2][2] + "\n");
        for (int r = 0; r < m3.length; r++) {
            for (int c = 0; c < m3[r].length; c++) {
                System.out.print(m3[r][c] +" ");
            }
            System.out.println();
//            System.out.println(String.format("m2[%d] = %d", r, m2[r].length));
        }

        for (int[] oneDarr : m3) {
            for (int item : oneDarr){
                System.out.print(item +"\t");
            }
            System.out.println();
        }


    }
}
