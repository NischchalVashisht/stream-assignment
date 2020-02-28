package com.knoldus;

interface IntegerOperation<T>{
    public abstract T opeartion(T first,T second,T third,T four,T five);
}

public class Lambda {

    public Integer getResult()
    {
        IntegerOperation<Integer> myOpeartion=(Integer a,Integer b ,Integer c,Integer d,Integer e)->a+b+c+d+e;
        return  myOpeartion.opeartion(10,10,10,10,10);
    }

}
