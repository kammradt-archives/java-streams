package StreamsAndFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {

        try {
            Files.lines(Paths.get("README.md"))
                    .filter(line -> line.contains("#"))
                    .map(line -> line.replaceAll("#", "").strip())
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
