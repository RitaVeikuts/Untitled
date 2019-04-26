package by.belhard.j2.l8.l1;

//IO - InputOutput


import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        String pathInput = "resources/example.data";
        String pathOutput = "resources/exampleOut.data";

        /*File nonExistFile = new File("resources/nonExist.ex");
        nonExistFile.createNewFile();*/
        File fileInput = new File(pathInput);
        File fileOutput = new File(pathOutput);
        System.out.println(fileInput.getParent());
        System.out.println(fileOutput.getParent());

        InputStream inputStream = new FileInputStream(pathInput);
        OutputStream outputStream = new FileOutputStream(pathOutput);  //, true);

        int read ;
        while ((read = inputStream.read()) != -1) {
            outputStream.write(read +1);

        }

        outputStream.flush();

        //System.out.println("\nend of stream");

    }
}