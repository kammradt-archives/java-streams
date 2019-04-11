package FlatMapAndOptional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Streams {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Kamm" , 10, Arrays.asList("9999-9999", "8888-8888")),
                new User("Alves", 40, Arrays.asList("3333-3333", "4444-4444")),
                new User("Cast" , 30, Arrays.asList("5555-5555", "6666-6666")),
                new User("Natan", 15, Arrays.asList("7777-7777", "1111-1111"))
        );

        // ?
        Optional<String> result = users.stream()
                .map(user-> user.getPhoneNumbers().stream())
                .flatMap(phones -> phones.filter(phone -> phone.equals("1111-1111")))
                .findFirst();

        result.ifPresent(System.out::println);
    }
}
