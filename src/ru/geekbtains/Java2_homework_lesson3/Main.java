package ru.geekbtains.Java2_homework_lesson3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

    /*    String [] order = {"Pizza", "Burger","Burger", "Sushi", "Juice", "Kebab","Kebab",
                        "Cola", "Beer", "Beer", "French fries","Juice","French fries","French fries"};
        Map <String, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length; i++){
            String meal = order[i];
            int val = map.getOrDefault(meal,0);
            map.put(meal,val + 1);
        }
        System.out.println(map); */

        Phonebook phonebook = new Phonebook();
        phonebook.add("Smirnov","5551520");
        phonebook.add("Petrov","5521200");
        phonebook.add("Sidorov","5551920");
        phonebook.add("Sidorov", "5524420");
        phonebook.get("Sidorov");
    }
}
