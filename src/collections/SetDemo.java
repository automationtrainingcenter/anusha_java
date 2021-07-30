package collections;

import java.util.*;

/*
 * Set is an inbuilt data structure in Java.
 * Set is an interface which is implemented by
 * HashSet: it won't maintain any order for your data
 * LinkedHashSet: it will maintain insertion order for the data
 * TreeSet: it will maintain alphabetical order for character data and ascending order for numeric data
 *
 * Set is not index based. So to retrieve the data we have to use either
 * for each loop or iterator interface.
 *
 * Set does not store duplicate values
 *
 */
public class SetDemo {

    public static void main(String[] args) {
        // Create a set
        Set<String> courses = new TreeSet<>();

        // print the data of the set
        System.out.println(courses);

        // find the number of items in a set
        System.out.println(courses.size());

        // to verify a set is empty or not
        System.out.println(courses.isEmpty());

        // add the data to the set
        courses.add("c");
        courses.add("cpp");
        courses.add("Java");
        courses.add("python");
        courses.add("selenium");
        courses.add("Django");

        System.out.println(courses);

        courses.add("spring");
        System.out.println(courses);


        // retrieve the data from the set either using foreach loop or iterator
        // for each loop
        System.out.println("For Loop");
        for(String course : courses) {
            System.out.println(course);
        }

        // using iterator interface
        System.out.println("Iterator");
        Iterator<String> it = courses.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // set is not index based so we can not insert the data
        // set does not allow duplicate values, so if we want update old data, delete old data and add new data
        // remove the data from the set
        courses.remove("Django");
        System.out.println(courses);
        courses.add("flask");
        System.out.println(courses);

        //  search for an item
        System.out.println(courses.contains("flask"));

        // remove all the items from the set
        courses.clear();
        System.out.println(courses);


    }

}
