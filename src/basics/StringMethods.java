package basics;

import java.util.Arrays;
import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {
        String s1 = "selenium";
        String s2 = "";
        String s3 = " webdriver";
        String s4 = "SUNSHINE";
        String s5 = "welcome to the selenium course with Java programming language";
        String s6 = "                          actual text                          ";

        /*
         * length() : which will return an integer value which is the number of
         * characters in the given string
         */
        //System.out.println(s1.length());
        //System.out.println(s2.length());
        System.out.println(s1.length());
        System.out.println(s2.length());
        //System.out.println(s7.isEmpty());

        /* isEmpty() : returns true if a given string is an empty string */
        //System.out.println(s1.isEmpty()); // false
        //System.out.println(s2.isEmpty()); // true

        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());


        /* concat(): combines two given strings */
        System.out.println(s1.concat(s3));
//		s1 = s1.concat(s3);
        System.out.println(s1);
        System.out.println(s3);

        /* equals(): verifies two strings are equal by considering case */
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals("Selenium"));
        System.out.println(s1.equals("selenium"));

        /*
         * equalsIgnoreCase(): verifies two strings are equal or not without considering
         * the case
         */
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase("Selenium"));
        /*
         * contains(): verifies a given substring is available inside the given string
         * or not
         */
        System.out.println(s5.contains(s1)); // true
        System.out.println(s5.toLowerCase().contains("java")); // true

        System.out.println(s5.contains("course"));
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.toUpperCase());


        /* toLowerCase(): converts given string to lower case */
        System.out.println(s4.toLowerCase());
		System.out.println(s4);

        /* toUpperCase(): converts given string to upper case */
        System.out.println(s1.toUpperCase());
//		System.out.println(s1);

        /* charAt(): returns a character at a given index number */
        System.out.println(s1.charAt(1));
        System.out.println(s1.charAt(2));

        /* indexOf(): returns index value of first occurrence of a given character */
        System.out.println(s1.indexOf('e'));
        System.out.println(s1.indexOf('z'));  // if character is not present in the string then it will return -1

        /* stratsWith(): verifies a given string starts with given substring */
        s3 = s1.concat(s3);
        System.out.println(s3.startsWith("selenium")); // true
        //	s1.endsWith("driver");

        /* endsWith(): verifies a given string ends with given substring */
        System.out.println(s3.endsWith("driver")); // true

        /*
         * replace(): it will replace given old character or old substring with new
         * character or new substring
         */
        System.out.println(s1.replace('e', 'E'));
        System.out.println(s5.replace("Java", "Python"));
        System.out.println(s1.replace('a','I'));

        /*
         * substring(): returns substring from a given string based on beginning and
         * optional ending index values Note: substring() will include the beginning
         * index character and excludes ending index character
         */
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(2, 5));
        System.out.println(s1.substring(1,4));


        /* toCharArray() return an array of characters inside the given string */
        char[] chars = s1.toCharArray();
        System.out.println(chars.length);
        System.out.println(chars[1]);

        /*
         * split() return an array of substrings inside the given string, divided based
         * on some expression
         */
        String[] words = s5.split(" ");
        // {"welcome", "to", "the", "selenium", "course", "with", "Java", "programming", "launguage"}
        System.out.println(words.length);
        System.out.println(words[6]);
        String[] sp = s6.split(" ");
        System.out.println(sp.length);
        System.out.println(sp[20]);


        /*
         * trim() which will remove extra spaces at beginning and ending of given string
         */
        System.out.println("before trim ::::" + s6+":::");
        System.out.println("after trim ::::" + s6.trim()+":::");
        System.out.println(s3.trim());

        /*
        format() which is used to format the give string with multiple variables
         */
        String name = "Anusha";
        String course ="selenium";
        String phNum = "9087654321";
        // HI this is Anusha, I'm interested in selenium and my contact number is 9087654321
        System.out.println("HI this is "+name+", I'm interested in "+course+" and my contact number is "+phNum);
        String fStr = String.format("HI this is %s, I'm interested in %s and my contact number is %s", name, course, phNum);
        String query = String.format("select * from %s where %s = '%s'", "transactions", "txnType", "1");
        System.out.println(fStr);
        System.out.println(query);
    }
}
