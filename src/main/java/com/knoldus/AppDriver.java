package com.knoldus;

/**
 * This class Work as main AppDriver.
 */
public class AppDriver {
    public static void main(String[] s) {
        System.out.println(new Lambda().getResult(1, 2, 3, 4, 5));
        System.out.println(new CitiesOperation().getResult());
        System.out.println(new ListMultiplication().getResult());
        System.out.println(new ListMultiplication().getResult());
    }

}
