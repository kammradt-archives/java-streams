package FilterAndForEach;

import java.util.Arrays;
import java.util.List;

public class Regular {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kamm", "Alves", "Natan", "Silva");

        System.out.println("");
        for (String name : names) {
            if (!name.equals("Kamm")){
                System.out.println(name + " is ugly. Blahhh.");
            }
        }
    }

}
