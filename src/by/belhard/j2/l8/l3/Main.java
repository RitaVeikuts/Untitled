package by.belhard.j2.l8.l3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputString;
        System.out.println("Enter string");
        while (!(inputString=reader.readLine()).equals("exit")) {   //сравнение строк

            System.out.println(inputString.toUpperCase());
            System.out.println("Enter string");

        }

        System.out.println("Good Bye");

    }
}
