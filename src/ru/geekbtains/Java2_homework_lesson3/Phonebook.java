package ru.geekbtains.Java2_homework_lesson3;

import java.util.*;

public class Phonebook {

    private Map<String, Set<String>> phonebook= new HashMap<>();

    public void add(String name, String number){
        Set<String> phone = phonebook.getOrDefault(name,new HashSet<>());
        phone.add(number);
        phonebook.put(name,phone);
    }
    public void get(String name){

        for (Map.Entry<String, Set<String>> entry : phonebook.entrySet()) {
            if (name.equals(entry.getKey()))  {

                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            
        }    

    }

}
