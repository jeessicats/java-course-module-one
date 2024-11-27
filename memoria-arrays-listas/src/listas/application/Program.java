package listas.application;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Jéssica");
        list.add("Ana");
        list.add("Bob");
        list.add("Mary");
        list.add(2, "John");
        list.add(3, "James");
        list.add(4, "Jack");

        System.out.println(list.size());

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("------------------------");

        list.remove("Ana");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("------------------------");

        list.removeIf(s -> s.charAt(0) == 'M');

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("Index of Bob is " + list.indexOf("Bob"));
    }
}
