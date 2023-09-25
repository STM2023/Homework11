package org.example;
import java.util.Arrays;

import java.util.stream.Collectors;

     public class Task3 {
         public static void main(String[] args) {

             String[] array1 = {"1, 2, 0", "4, 5"};
             //System.out.println(Arrays.toString(array1));

             String s3 = Arrays.stream(array1).map(s->s.split(", ")) //разбиваем
                     .flatMap(Arrays::stream) //выравнивает каждый сгенерированный поток в один поток
                     .sorted()
                     .collect(Collectors.joining(",", "\"", "\""));
             System.out.println(s3);

    }

}
