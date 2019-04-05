package MapAndCollect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kamm", "Alves", "Natan", "Silva");

        List<User> userList = names.stream()
            .filter(Streams::isNotKamm)
            .map(User::new)
            .collect(Collectors.toList());

        userList.forEach(System.out::println);
    }

    private static boolean isNotKamm(String name) {
        return !name.equals("Kamm");
    }


}
