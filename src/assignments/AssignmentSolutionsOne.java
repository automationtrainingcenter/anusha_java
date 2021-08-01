package assignments;

import java.util.Scanner;

public class AssignmentSolutionsOne {
      Scanner sc = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("Select the operation you want to perform on the given number");
        System.out.println("EvenOrOdd");
        System.out.println("SquareRoot");
        System.out.println("DivisibleBy3");
        System.out.println("VowelOrNot");
        System.out.println("palindromeOrNot");
        System.out.println("findFactorial");
        System.out.println("reverseString");
        System.out.println("printPrimeNumbers");
        System.out.println("stringWithOutVowels");
        System.out.println("armstrongOrNot");
        System.out.println("toCheckAnagram");
        System.out.println("Exit");
        String input = sc.next();
        while (!input.equalsIgnoreCase("Exit")) {
            if (input.equalsIgnoreCase("EvenOrOdd")) {
                isOddOrEven();
            } else if (input.equalsIgnoreCase("SquareRoot")) {
                findSquareRoot();
            } else if (input.equalsIgnoreCase("DivisibleBy3")) {
                isDivisibleBy3();
            }else if (input.equalsIgnoreCase("VowelOrNot")) {
                 isVowelOrNot();
            }else if (input.equalsIgnoreCase("palindromeOrNot")){
                palindromeOrNot();
            }else if (input.equalsIgnoreCase("findFactorial")){
                findFactorial();
            }else if (input.equalsIgnoreCase("reverseString")){
                reversingString();
            }
            else if (input.equalsIgnoreCase("printPrimeNumbers")){
                printPrimeNumbers();
            }
            else if (input.equalsIgnoreCase("stringWithOutVowels")){
                stringWithOutVowels();
            }else if (input.equalsIgnoreCase("armstrongOrNot")){
                armstrongOrNot();
            }else if (input.equalsIgnoreCase("toCheckAnagram")){
                toCheckAnagram();
            } else {
                System.out.println("Invalid option");
                break;
            }
        }
    }

    public void isOddOrEven(){
        System.out.println("Enter the number to find Even or Odd");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("Given number is a Even Number");
        }
        else
            System.out.println("Given number is a Odd Number ");
            displayMenu();
    }

    public void findSquareRoot() {
        System.out.println("enter the number to find square root of the number");
        int num = sc.nextInt();
        double start = 0;
        double end = num;
        double mid= 0;
        while(end-start>0.0001) {
            mid = (start + end) / 2;
            //System.out.println(mid);
            if (mid * mid >num) {
                end = mid;
            } else if (mid * mid <= num) {
                start = mid;
            }
        }
        System.out.println("Square root of the given number is " + mid);
        displayMenu();
    }
    public void isDivisibleBy3(){
        System.out.println("enter the number to find is the given number divisible by 3 or not");
        int num = sc.nextInt();
        if(num%3==0) {
            System.out.println("Given number is divisible by 3");
        }else{
            System.out.println("Given number is not divisible by 3");
        }
        displayMenu();
    }
    public void isVowelOrNot() {
        System.out.println("enter the character to check vowel or not");
        String s = sc.next();
        char ch = s.charAt(0);
        if ((ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u') || (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'))
            System.out.println("entered character is a vowel");

        else
            System.out.println("Entered character is not a vowel");

        displayMenu();
    }
    public void palindromeOrNot() {
        System.out.println("enter number to check palindrome or not ");
        int num = sc.nextInt();
        int n = num;
        int reverse = 0;
        while (n >=1) {
            reverse = (reverse * 10) + (n% 10);
            //System.out.println(reverse);
            n = n / 10;
            //System.out.println(n);
        }
        if (num== reverse)
            System.out.println(String.format("%d is a Palindrome number", num));
        else
            System.out.println(String.format("%d is not a Palindrome number", num));

        displayMenu();
    }
    public void findFactorial() {
        System.out.println("enter number to find factorial of the number");
        int num = sc.nextInt();
        int fact = 1;
        if (num == 0) {
            System.out.println(String.format("factorial of 0 is %d", fact));
        } else if (num > 0) {
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println(String.format("factorial of %d is %d", num,fact));
        }
        else
            System.out.println("invalid input");
        displayMenu();
    }
    public void reversingString(){
        System.out.println("enter the string to print in reverse");
        String s = sc.next();
        String reverse = "";
        int n = s.length();
        //System.out.println(n);
        for(int i=n-1;i>=0;i--){
           String r =  Character.toString(s.charAt(i));
           reverse = reverse.concat(r);
        }
        System.out.println(String.format("%s  in reverse is %s", s,reverse));
        displayMenu();
    }
    public void printPrimeNumbers() {
        System.out.println("enter the number to print prime numbers until given number");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            int count = 0;
            //System.out.println(i);
            for (int j = 2; j <i; j++) {
                //System.out.println(j);
                if (i % j == 0) {
                        count++;
                    //System.out.println(i);
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
        displayMenu();
    }


    public void stringWithOutVowels() {
        while(true) {
            System.out.println("Enter the string");
            String s = sc.next();
            if ((s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains("u")) || (s.contains("A") || s.contains("E") || s.contains("I") || s.contains("O") || s.contains("U"))) {
                System.out.println(s);
            } else
                break;
        }
                displayMenu();
    }

    public void armstrongOrNot(){
        System.out.println("Enter the number to check is Armstrong or not");
        int num = sc.nextInt();
        int n = num;
        int aNum = 0;
        while(n>0) {// if is not working
            int m = n % 10;
            aNum = aNum + (m * m * m);
            n = n / 10;
        }
        if(aNum==num)
            System.out.println(String.format("Given number %d is a Armstrong Number", num));
        else
            System.out.println(String.format("Given number %d is not a Armstrong number", num));
        displayMenu();
    }

    public void toCheckAnagram(){
        System.out.println("Enter String1 to check the anagram or not");
        String s1 = sc.next();
        System.out.println("Enter String2 to check the anagram or not");
        String s2 = sc.next();
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s1.toCharArray();
        int count = 0;
        if (chars1.length==chars2.length) {
            for (int i = 0; i < chars1.length; i++) {
                        for (int j = 0; j < chars1.length; j++) {
                            if (chars1[i] == chars2[j])
                                count++;
                        }
                    }
            if(count==chars1.length)
                System.out.println("given strings are anagrams");
        }
        else
            System.out.println("given strings are not Anagrams");
    }



        public static void main(String[] args) {
            AssignmentSolutionsOne obj = new AssignmentSolutionsOne();
            obj.displayMenu();
    }
}
