package FilterAndForEach;

import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kamm", "Alves", "Natan", "Silva");

        names.stream()
                .filter(Streams::isNotKamm)
                .forEach(Streams::printTheTruth);
    }

    private static boolean isNotKamm(String name) {
        return !name.equals("Kamm");
    }

    private static void printTheTruth(String name) {
        System.out.println(name + " is ugly. Bleeeh.");
    }
}
