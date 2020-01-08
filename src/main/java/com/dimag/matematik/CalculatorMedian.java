package com.dimag.matematik;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class CalculatorMedian {




    public static List<Integer> sort(List<Integer> list1){
        return list1.stream().sorted().collect(Collectors.toList());

    }

    public static double median(List<Integer> list){

        double result=0;

        if (list.size()%2==0){
            double value1 = list.get(list.size()/2);
            double value2 = list.get(list.size()/2-(1));
            return result = (value1+value2)/2;

        }else if(list.size()%2!=0){
            return result = list.get(list.size()/2);
        }
        return 0;
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();


        list.add(-5);
        list.add(6);        //-222,1,2,5,6,226,227,228
        list.add(1);
        list.add(2);
        list.add(-222);
        list.add(226);
        list.add(227);
        list.add(229);

        System.out.println(median(sort(list)));

    }

}


