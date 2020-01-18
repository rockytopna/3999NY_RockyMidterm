package datastructure;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */

        Map<String, List<String>> list = new HashMap<>();

        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Orange");
        list1.add("Banana");
        list1.add("Mango");

        List<String> list2 = new ArrayList<>();
        list2.add("Potato");
        list2.add("Tomato");
        list2.add("EggPlant");
        list2.add("Bits");

        List<String> list3 = new ArrayList<>();
        list3.add("Chicken");
        list3.add("Duck");
        list3.add("Goat");
        list3.add("Beef");

        list.put("Fruits", list1);
        list.put("Vegitables", list2);
        list.put("Meats", list3);


        list.forEach((k, v) -> System.out.println(" the key is -->" + k + " " + "the value is " + " " + v));
        System.out.println(" Using Iterator ");
        Iterator<Map.Entry<String, List<String>>> itr = list.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, List<String>> entry = itr.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }


    }

}
