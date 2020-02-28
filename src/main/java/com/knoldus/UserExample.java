package com.knoldus;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class User {
    int id;
    String name;
    String address;
    int age;

    User(int id, String name, String address, int age) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public List<User> getinitialize() {
        List<User> list = new ArrayList<>();
        list.add(new User(1, "abc", "J&k", 10));
        list.add(new User(15, "def", "chandigarh", 15));
        list.add(new User(20, "ghi", "Delhi", 18));

        list.add(new User(25, "def", "Haryana", 22));

        list.add(new User(27, "klm", "Goa", 27));
        return list;
    }

    public List<User> getFirst() {
        List<User> list = getinitialize();
        return list.stream().filter(x -> x.age > 18 && x.address.equals("Delhi")).collect(Collectors.toList());
    }

    public List<User> getSecond() {
        List<User> list = getinitialize();
        return list.stream().filter(x -> x.age < 20 && x.id > 10).collect(Collectors.toList());
    }

    public List<User> getThird() {
        List<User> list = getinitialize();
        return list.stream().filter(x -> x.age == 18 && x.address.equals("Delhi")).collect(Collectors.toList());
    }

    public List<User> getFourth() {
        List<User> list = getinitialize();
        return list.stream().filter(x -> x.age % 2 == 0).collect(Collectors.toList());
    }

    public void getResult(List<User> list) {
        for (User a : list) {
            System.out.println("Name -> " + a.name + " Id -> " + a.id + " Age -> " + a.age + "  Address ->" + a.address);
        }

    }

}