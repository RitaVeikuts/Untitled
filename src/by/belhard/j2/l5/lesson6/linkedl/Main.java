package by.belhard.j2.l5.lesson6.linkedl;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        list.add("one");
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
        System.out.println("contains 'two' : " + contains);

    }
}
