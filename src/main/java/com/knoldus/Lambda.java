package com.knoldus;



/**
 *  Following Class represent
 */
public class Lambda {

    /**
     *
     * @param <T> Following functional Interface uses for basic Operation.
     */

    private interface IntegerOperation<T> {
        T operation(T first, T second, T third, T four, T five);
    }
    public Integer getResult(Integer l, Integer m, Integer n, Integer o, Integer p) {
        IntegerOperation<Integer> myOperation = (Integer a, Integer b, Integer c, Integer d, Integer e)
                -> a + b + c + d + e;
        return myOperation.operation(l, m, n, o, p);
    }

}
