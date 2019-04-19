package by.belhard.j2.l5.lesson6.arrlist;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        /*list.add("one");
        list.add("two");
        list.add("three");
        list.add(1,"one and half");
        boolean contains = list.contains("two");
        list.set(3, "five");
        list.remove("two");
        list.add("one");
        list.add("one");
        list.add("one");
        list.add("one");

        System.out.println(list);
        System.out.println(list.size() + " " + list.isEmpty());
        System.out.println("contains 'two' : " + contains);*/

        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("one");

       /* Iterator<String > iterator = set.iterator();
        if (set.equals("two")) set.remove(s);*/



        for  (String s: set) {
            System.out.println(s + " " + s);
        }

        System.out.println(set);

    }
}
