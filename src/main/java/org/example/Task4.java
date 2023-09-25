package org.example;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        long a=25214903917l;
        int c=11;
        long m= pow(2,48);
        System.out.println("начальные параметры ");
        System.out.println(" a= " +a+ " c= " +c + " m= "+m);

        Stream<Long>  strLong = solutionTask4(a,c,m);

        List<Long>  strIter = strLong.collect(Collectors.toList());
        System.out.println( strIter);

    }
   public static Stream<Long> solutionTask4(long a,int c, long m) {

       Stream <Long> strLong= Stream.iterate(0l, x -> 1*(a*x + c) % m)
               .limit(10);

       return strLong;
   }
//
    public static long pow(int value, int powValue) {
       //возведение   value в степень  powValue;
      //  System.out.println("  value= " + value+ " powValue= " +powValue );
        long result = 1;
        for (int i = 1; i <= powValue; i++) {
            result = result * value;
            //System.out.println(" i= " +i+"  result= " + result );
        }

        //System.out.println("  result= " + result );
        return result ;
    }
}


