package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(WordCount.class.getResource(file).toURI());
        Paths.get(file, "lear.txt");
        List<String> lines = Files.readAllLines(path, charset);

        StringBuilder text = new StringBuilder();
        int linesCount = 0;
        for (String line : lines) {
            text.append(line).append(" ");
            linesCount++;
        }

        String[] words = text.toString().split(" ");

        int chars = 0;
        int charCount = 0;
        for (String line : lines) {
            for (int j = 0; j < line.length(); j++) {
                charCount++;
                char character = line.charAt(j);
                if (Character.isLetterOrDigit(character)) {
                    chars++;
                }

            }
        }

        int wordsCount = words.length;
        System.out.println();
        System.out.println("Lines = " + linesCount);
        System.out.println("Words = " + wordsCount);
        System.out.println("Chars = " + charCount);
        System.out.println("Only letters or digits = " + chars);

    }

}
