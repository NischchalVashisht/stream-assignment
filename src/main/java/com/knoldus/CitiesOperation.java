package com.knoldus;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Following Class uses for sorting List of Cities on specific Types.
 */
public class CitiesOperation {

    /**
     *
     * @return Returns a list of sorted Cities
     */
    public List<String> getResult() {
        List<String> myList = new ArrayList();
        myList.add("Delhi");
        myList.add("Chandigarh");
        myList.add("china");
        myList.add("chit");
        return myList.stream()
                .filter(list -> list.toUpperCase().startsWith("C"))
                .sorted()
                .collect(Collectors.toList());

    }
}
