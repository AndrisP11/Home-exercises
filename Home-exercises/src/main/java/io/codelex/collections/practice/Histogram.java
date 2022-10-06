package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        System.out.println(scores);
        System.out.println();
        diagram(scores);
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }

    private static void diagram(String scores) {

        String[] scoresArray = scores.split(" ");
        List<Integer> scoresInt = new ArrayList<>();
        for (String elem : scoresArray) {
            scoresInt.add(Integer.parseInt(elem));
        }

        for (int i = 0; i <= 100; i++) {
            if (i == 0) {
                System.out.print("00-09: ");
            } else if (i == 100) {
                System.out.println();
                System.out.print("  100: ");
            } else if (i % 10 == 0) {
                System.out.println();
                System.out.print(i + "-" + (i + 9) + ": ");
            }

            for (Integer score : scoresInt) {
                if (i == score) {
                    System.out.print("*");
                }
            }
        }
    }
}
