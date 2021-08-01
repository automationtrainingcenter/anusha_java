package collections;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("c");
        courses.add("cpp");
        courses.add("Java");
        courses.add("Python");
        courses.add("cpp");
        courses.add("selenium");
        courses.add("testing");
        courses.add("flask");
        courses.add("django");
        courses.add("kotlin");
        courses.add("php");
        courses.add("devops");
        courses.add("aws");


        List<String> ucourses = new ArrayList<>();
        for(String course : courses) {
            String s = course.toUpperCase();
            ucourses.add(s);
        }
        System.out.println(ucourses);

        List<String> filterCourses = new ArrayList<>();
        for(String course : courses) {
            if(course.length() > 3) {
                filterCourses.add(course);
            }
        }

        for(String filterCourse : filterCourses) {
            System.out.println(filterCourse.toUpperCase());
        }

        Function<String, String> map = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };

        Predicate<String> filter = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() <= 3;
            }
        };

        // convert collect to stream
//        Stream<String> stream = courses.stream();
//        List<String> collect = stream.map(course -> course.toUpperCase()).collect(Collectors.toList());
        // map() is used to modify the data of a stream
        List<String> collect = courses.stream().map(course -> course.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect);

        // filter() is used to filter the data of a stream
//        List<String> filterStream = courses.stream().filter(filter).collect(Collectors.toList());
        List<String> filterStream = courses.stream().filter(course -> course.length() > 3).collect(Collectors.toList());
        System.out.println(filterStream);

        filterStream.stream().map(String::toUpperCase).forEach(System.out::println);


        courses.stream().filter(course -> course.length() > 3).map(String::toUpperCase).forEach(course -> System.out.println("Course is "+course));


        System.out.println(courses.stream().anyMatch(course -> course.length() > 3));

        System.out.println(courses.stream().allMatch(course -> course.length() < 10));

        System.out.println(courses.stream().distinct().collect(Collectors.toList()));

        System.out.println(Arrays.stream("sssuuurrryyyyaaaas".split("")).distinct().collect(Collectors.joining()));

        System.out.println(courses.stream().filter(course -> course.length() > 3).findFirst().get());

        System.out.println(courses.stream().filter(course -> course.length() > 3).findAny().get());
    }
}
