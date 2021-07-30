package collections;

/*
 * collections are inbuilt data structures in java
 * To store collection of values of similar type we can use these Collection Types
 * There are several collection type in Java
 * 1. List: is used to store collection of values of similar type. it allows duplicate values also
 * 2. Set: it is same as list but it does not allow duplicate values
 * 3. Map: it is used to store data as key and value pairs like a dictionary
 *
 * All these interfaces. We mainly focus on performing CRUD operations using these types
 * C - Create, R - Retrieve, U - Update and D - Delete
 *
 * List is an interface which is implemented by ArrayList and LinkedList classes
 * ArrayList is same as array but it's size is dynamic
 * LinkedList is like double linked list (current node will store both previous node and next node addresses)
 *
 * List is index based, and index numbers starts with 0
 *
 * To add, update and retrieve ArrayList is very fast
 * To insert and delete LinkedList is very fast
 *
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        // creating a new list
        List<String> courses = new LinkedList<>();

        // print the data of list
        System.out.println(courses);

        // get the number of items in a list
        System.out.println(courses.size());

        // verify a list is empty or not
        System.out.println(courses.isEmpty());

        // add data to the list
        courses.add("c");
        courses.add("cpp");
        courses.add("java");
        courses.add("python");
        courses.add("selenium");
        courses.add("django");


        System.out.println(courses);
        System.out.println(courses.size());
        System.out.println(courses.isEmpty());

        // retrieve the data from the list using get()
        System.out.println(courses.get(0));
        System.out.println(courses.get(1));

        // retrieve the data from the list using for loop
        for( int i=0; i<courses.size(); i++) {
            System.out.println(courses.get(i));
        }

        // retrieve the data from the list using foreach loop
        for(String course : courses) {
            System.out.println(course);
        }

        // insert the data
        courses.add(3, "flask");
        System.out.println(courses);

        // get() and add(index, data) will throw IndexOutOfBoundsException if we provide index number greater than or equal to  size of list

        // update the data
        courses.set(3, "selenium");
        System.out.println(courses);

        // delete the data
        courses.remove(1);
        System.out.println(courses);

        courses.remove("selenium");
        System.out.println(courses);

        // search for a value
        System.out.println(courses.contains("Java"));

        // remove all the items of list
        courses.clear();
        System.out.println(courses);



    }

}
