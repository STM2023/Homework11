package org.example;
import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

        public static void main(String[] args) {
            List<String>  names =
                    Arrays.asList("Ivan", "Olga","Peter","Juli","Artem","Nata","Artur" );

            System.out.println(names);
            String line=solutionTask1(names);

            System.out.println(line);
        }
    public static String solutionTask1(List<String> name) {

        for(int j=0 ;j< name.size();j++){
            name.set(j,(j+1)+ "." +  name.get(j));
           // System.out.println("element of list: " + name.get(j));
         }
      //  System.out.println(name);

        int skip = 2;
        int size = name.size();
        int limit = size / skip + Math.min(size % skip, 1);

        List<String> result = Stream.iterate(0, i -> i + skip)
                .limit(limit)
                .map(name::get)

                .collect(Collectors.toList());

     //   System.out.println(result); // [Ivan, Peter, Artem, Artur]+-*

        return result.toString();

    }
}
