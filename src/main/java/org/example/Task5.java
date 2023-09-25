package org.example;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {

    public static void main(String[] args) {

        Stream<String>  first =
                Stream.of("a","b","c","d","e");
        Stream<String>   second =
                Stream.of("1","2","3","4","5","6","7","8","9");

        Stream<String> result = zip(first , second);

        List<String>  resultArr =  result.collect(Collectors.toList());

        System.out.println("отримали:  ");
        System.out.println(resultArr);

    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        // System.out.println("работает метод   zip");

        List<T>  firstArr= first.collect(Collectors.toList());
        List<T>   secondArr=  second.collect(Collectors.toList()) ;
        //System.out.println("исходные  ");
        System.out.println("список:  first "+firstArr);
        System.out.println("список:  second " +secondArr);

        List<T>  generalList=new ArrayList<>();

        Iterator<T> iterFirst= firstArr.iterator();
        Iterator<T> iterSecond=secondArr.iterator();

        while(iterFirst.hasNext()&&iterSecond.hasNext()){

            generalList.add(iterFirst.next());
            generalList.add(iterSecond.next());

        }

        Stream<T> generalStrim =generalList.stream();

        return generalStrim ;
    }
}



