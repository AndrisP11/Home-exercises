package io.codelex.fiveTasks.FourthTask;

import java.io.*;

public class ReadWrite {
    private static final String PATH = "D:/Job/Programming/Home/Home-exercises/Home-exercises/src/main/java/io/codelex/fiveTasks/FourthTask/";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(PATH + "Read.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter(PATH + "Write.txt"));

        String line;
        while ((line = in.readLine()) != null) {
            String enil = "";
            char ch;
            for (int i = 0; i < line.length(); i++) {
                ch = line.charAt(i);
                enil = ch + enil;
            }
            out.write(enil);
        }
        in.close();
        out.close();
    }
}
