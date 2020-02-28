package com.knoldus;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  following is a final class Of User having four Fields
 */
class UserExample {
    int id;
    String name;
    String address;
    int age;

    UserExample(int id, String name, String address, int age) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
    }

    /**
     *
     * @return returns a initialize list of User
     */
    public List<UserExample> getinitialize() {
        List<UserExample> list = new ArrayList<>();
        list.add(new UserExample(1, "abc", "J&k", 10));
        list.add(new UserExample(15, "def", "chandigarh", 15));
        list.add(new UserExample(20, "ghi", "Delhi", 18));

        list.add(new UserExample(25, "def", "Haryana", 22));

        list.add(new UserExample(27, "klm", "Goa", 27));
        return list;
    }
    /**
     *
     * @return returns  List out all the users with age above 18 and address Delhi.
     */

    public List<UserExample> getFirst() {
        List<UserExample> list = getinitialize();
        return list.stream().filter(x -> x.age > 18 && x.address.equals("Delhi")).collect(Collectors.toList());
    }

    /**
     *
     * @return returns  List out all the users with id greater than 10 and age less than 20.
     */
    public List<UserExample> getSecond() {
        List<UserExample> list = getinitialize();
        return list.stream().filter(x -> x.age < 20 && x.id > 10).collect(Collectors.toList());
    }

    /**
     *
     * @return returns  List out all the users with age as even number.
     */

    public List<UserExample> getThird() {
        List<UserExample> list = getinitialize();
        return list.stream().filter(x -> x.age == 18 && x.address.equals("Delhi")).collect(Collectors.toList());
    }

    /**
     *
     * @return returns  List out all the users with age equals to 18 and address Delhi.
     */

    public List<UserExample> getFourth() {
        List<UserExample> list = getinitialize();
        return list.stream().filter(x -> x.age % 2 == 0).collect(Collectors.toList());
    }


    /**
     *
     * @return print list 
     */
    public void getResult(List<UserExample> list) {
        for (UserExample a : list) {
            System.out.println("Name -> " + a.name + " Id -> " + a.id + " Age -> " + a.age
                    + "  Address ->" + a.address);
        }

    }

}