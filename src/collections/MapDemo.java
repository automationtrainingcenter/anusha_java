package collections;

/*
 * Map is also collection type which is used to store the data in key and value pairs
 * Map is an interface which is implemented three classes
 * 1 HashMap it will not maintain any order
 * 2 LinkedHashMap it will maintain insertion order
 * 3 TreeMap it will maintain ascending for numeric data and alphabetical order for character data based
 * on keys
 *
 *
 * keys are unique i.e. we can't duplicate keys. Values can be duplicated.
 */

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        // creating a map
        Map<String, Float> courses = new TreeMap<>();

        // find the number of items (combination of key and value pairs) in a map
        System.out.println(courses.size());

        // verify a map is empty or not
        System.out.println(courses.isEmpty());

        // add the data to the map put()
        courses.put("c", 4000.00f);
        courses.put("cpp", 5000.00f);
        courses.put("Java", 5000.00f);
        courses.put("selenium", 12000.00f);
        courses.put("python", 6500.00f);
        courses.put("Django", 10000.00f);

        // print the data of the map
        System.out.println(courses);

        courses.put("cpp", 4500.00f);
        System.out.println(courses);

        // Note: if key already exists then map updates the data of that key else map will add key and value as a new item.
        // retrieve the data from a map
        // retrieve one item from the map
        System.out.println(courses.get("cpp"));

        // keySet() returns all the keys of map as Set
        Set<String> keys = courses.keySet();
        for(String key : keys){
            System.out.printf("%s :: %f\n", key, courses.get(key));
        }

        // values() returns Collection interface object
        Collection<Float> values = courses.values();
        for(Float value : values){
            System.out.println(value);
        }

        // entrySet() returns an Entry interface object. This Entry interface have two methods, getKey() returns key and getValue() returns value of the item
        Set<Map.Entry<String, Float>> entries = courses.entrySet();
        for(Map.Entry<String, Float> item : entries) {
            System.out.println(String.format("%s = %.2f", item.getKey(), item.getValue()));
        }

        // using iterator interface
        Iterator<Map.Entry<String, Float>> it = courses.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<String, Float> next = it.next();
            System.out.println(String.format("%s --- %.3f", next.getKey(), next.getValue()));
        }

        // delete the data from the map
        courses.remove("c");
        System.out.println(courses);

        courses.remove("Java", 5000.00f);
        System.out.println(courses);

        // search for a key
        System.out.println(courses.containsKey("python"));

        // search for a value
        System.out.println(courses.containsValue(10000.00f));

        // remove all the items from the map
//        courses.clear();
        System.out.println(courses);
        System.out.println(courses.size());

        courses.entrySet().stream().filter(entry -> entry.getValue() > 5000.00).forEach(System.out::println);


    }
}
