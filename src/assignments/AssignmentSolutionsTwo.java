package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class AssignmentSolutionsTwo {
    Scanner sc = new Scanner(System.in);
    int[] arr1;
    int[] arr2;
    String[] strArr;
    int n;
    public void displayMenu() {
        System.out.println("Select the Operation you want to perform");
        System.out.println("copingData");
        System.out.println("findLength");
        System.out.println("addition");
        System.out.println("findSecondLargestNum");
        System.out.println("printNumOccurEvenTimes");
        System.out.println("storeLengthOfString");
        System.out.println("findSumAndAvgOfArrayElements");
        System.out.println("verifyIdentityMatrixOrNot");
        System.out.println("Exit");
        String input = sc.next();
        if (input.equalsIgnoreCase("copingData"))
            copingData();
        else if (input.equalsIgnoreCase("findLength"))
            findLength();
        else if (input.equalsIgnoreCase("findSecondLargestNum"))
            findSecondLargestNum();
        else if (input.equalsIgnoreCase("printNumOccurEvenTimes"))
            printNumOccurEvenTimes();
        else if (input.equalsIgnoreCase("storeLengthOfString"))
            storeLengthOfString();
        else if (input.equalsIgnoreCase("findSumAndAvgOfArrayElements"))
            findSumAndAvgOfArrayElements();
        else if (input.equalsIgnoreCase("verifyIdentityMatrixOrNot"))
            verifyIdentityMatrixOrNot();
        else if (input.equalsIgnoreCase("addition"))
            addition();
        else
            System.out.println("invalid option");
    }
    public void copingData() {
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter elements into the array1");
            arr1[i] = sc.nextInt();
        }
        int[] cpyArr = new int[n];
        System.out.println("Array1 elements are");
        for(int ele:arr1)
            System.out.println(ele);
        System.out.println("After coping the elements of Array1 to Array2");
        for (int i = 0; i < n; i++) {
            cpyArr[i] = arr1[i];
            System.out.println(String.format("Array2 element at index %d is %d", i,cpyArr[i]));
        }
        displayMenu();
    }
    public void findLength() {
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter elements into the array1");
            arr1[i] = sc.nextInt();
        }
        int i= 0;
        for(int ele:arr1)
            i++;
            System.out.println(String.format("Length of the array is %d",i));
            displayMenu();
    }
    public void addition() {
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        arr1 = new int[n];
        arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter elements into the array1");
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("enter elements into the array2");
            arr2[i] = sc.nextInt();
        }
        int[] addedArr = new int[n];
        for(int i=0;i<n;i++){
            addedArr[i]=arr1[i]+arr2[i];
            System.out.println(String.format("Array2 element at index %d is %d", i,addedArr[i]));
        }
        displayMenu();
    }
    public void findSecondLargestNum(){
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter elements into the array");
            arr1[i] = sc.nextInt();
        }

        int grater = 0;
            for (int i = 1; i < n; i++) {
                if (arr1[i - 1] > arr1[i]) {
                    int temp = arr1[i - 1];
                    arr1[i - 1] = arr1[i];
                    arr1[i] = temp;
                }
            }
                System.out.printf("greater element in array1 is %d ", arr1[n-2]);
        }

    public void printNumOccurEvenTimes() {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (arr1[i - 1] > arr1[i]) {
                int temp = arr1[i - 1];
                arr1[i - 1] = arr1[i];
                arr1[i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++)
                if (arr1[i] == arr1[j])
                    count++;
                if (arr1[i]==arr1[i-1])
                    count++;
                if ((count % 2 == 0)) {
                    System.out.println(String.format("%d occurred even number times", arr1[i]));
                    count = 0;
                }

        }
        Arrays.asList(arr1);
    }

    public void storeLengthOfString(){
        System.out.println("enter the length of the Array");
        int n = sc.nextInt();
        strArr = new String[n];
        int[] lenArr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter String into the stringArray");
            strArr[i] = sc.next();
            lenArr[i] = strArr[i].length();
        }
        for (int i = 0; i < n; i++)
            System.out.println(lenArr[i]);
    }

    public void findSumAndAvgOfArrayElements(){
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        int sum=0;
        arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter elements into the array");
            arr1[i] = sc.nextInt();
            sum = sum+arr1[i];
        }
        System.out.println(String.format("Sum of the elements in the array is %d", sum));
        float avg = sum/n;
        System.out.println(String.format("Sum of the elements in the array is %f", avg));
    }
    public void verifyIdentityMatrixOrNot() {
        boolean status=false;
        System.out.println("Enter no.of rows of the array");
        int r = sc.nextInt();
        System.out.println("Enter no.of columns of the array");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            System.out.println(String.format("enter elements into the %d row of the array", i));
            for (int j = 0; j < c; j++) {
                System.out.println(String.format("enter element into %d %d column of the array", i, j));
                arr[i][j] = sc.nextInt();
            }
        }
        if (r == c) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (i == j && arr[i][j] == 1)
                        status = true;
                    if (i != j && arr[i][j] == 0)
                        status = true;
                }
            }
                    if(status)
                        System.out.println("Given matrix is Identity Matrix");
                    else
                    System.out.println("Given matrix is not a Identity matrix");
            }
        else
            System.out.println("Given matrix is not a identity matrix");
        }

    public static void main(String [] args){
        AssignmentSolutionsTwo obj = new AssignmentSolutionsTwo();
        obj. displayMenu();
    }
}
