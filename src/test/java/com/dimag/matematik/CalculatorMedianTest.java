package com.dimag.matematik;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CalculatorMedianTest {

    @Test
    public void main() {
        CalculatorMedian medianCalculator = new CalculatorMedian();
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);        //-222,1,2,5,6,226,227,228
        list.add(1);
        list.add(2);
        list.add(-222);
        list.add(226);
        list.add(227);
        list.add(229);

        int sonuc = (int) medianCalculator.median(CalculatorMedian.sort(list));
        assertEquals(5.5,sonuc,100);

    }

    @Test
    public void sort() {
        CalculatorMedian medianCalculator = new CalculatorMedian();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(10);
        list.add(267);
        list.add(14);
        list.add(30);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(5);
        list2.add(8);
        list2.add(10);
        list2.add(14);
        list2.add(30);
        list2.add(267);


        List<Integer> sonuc= medianCalculator.sort(list);
        assertEquals(list2,sonuc);
    }

    @Test
    public void median() {
        CalculatorMedian medianCalculator = new CalculatorMedian();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(10);
        list.add(267);
        list.add(14);
        list.add(30);
        double sonuc = medianCalculator.median(list);
        assertEquals(10,sonuc,1);

    }
}