package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String>  names =
                Arrays.asList("Ivan", "Olga","Peter","Juli","Artem","Nata","Artur" );

        System.out.println(names);

        List<String>  namesNew=solutionTask2(names);
        System.out.println(namesNew);
    }
    public static List<String> solutionTask2(List<String> name) {

        Stream<String> namesStrim = name.stream()
                        .map(x ->  x.toUpperCase())
                        .sorted(Collections.reverseOrder());


        List<String> filteredNames = namesStrim.collect(Collectors.toList());

       // System.out.println(filteredNames);
        return filteredNames;
    }
}
