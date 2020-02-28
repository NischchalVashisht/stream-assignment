package com.knoldus;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Following class Do multiplication of List of same size
 */
public class ListMultiplication {
    /**
     *
     * @param <T> Following functional Interface take two generic type of list
     */
   private interface Cityeration<T> {
        List<T> cityOperation(List<T> first, List<T> Second);
    }

    /**
     *
     * @return Multiplication result
     */
    public List<Integer> getResult() {
        List<Integer> firstList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> secondList = Arrays.asList(1, 2, 3, 4, 5);
        Cityeration<Integer> c = (first, second) -> IntStream
                .range(0, first.size() <= second.size() ? first.size() : second.size())
                .map(i -> first.get(i) * second.get(i)).boxed().collect(Collectors.toList());
        return c.cityOperation(firstList, secondList);
    }

}
