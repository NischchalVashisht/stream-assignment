package com.knoldus;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CitiesOperation<String> {

    public List<java.lang.String> getResult() {
        List<java.lang.String> myList=new ArrayList<java.lang.String>();
        myList.add("Delhi");
        myList.add("Chandigarh");
        myList.add("china");
        myList.add("chit");
        return   myList.stream().
                filter(list -> list.toUpperCase().startsWith("C")).
                sorted().collect(Collectors.toList());

    }
}
