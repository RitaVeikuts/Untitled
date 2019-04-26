package by.belhard.j2.l8.l2;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        String input = "resources/example.data";
        String output = "resources/exampleOut.data";

        BufferedReader reader = new BufferedReader(new FileReader(input));
        BufferedWriter writer = new BufferedWriter(new FileWriter(output));

        StringBuilder s =new StringBuilder();

        while (reader.ready()) {

            s.append("line: ").append(reader.readLine()).append("\n");


            /*s = reader.readLine();
            System.out.println("line: " + s);*/


        }

        writer.write(s.toString());
        writer.flush();
    }
}
