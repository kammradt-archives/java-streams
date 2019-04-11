package FlatMapAndOptional;

import java.util.Arrays;
import java.util.List;

public class Regular {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Kamm" , 10, Arrays.asList("9999-9999", "8888-8888")),
                new User("Alves", 40, Arrays.asList("3333-3333", "4444-4444")),
                new User("Cast" , 30, Arrays.asList("5555-5555", "6666-6666")),
                new User("Natan", 15, Arrays.asList("7777-7777", "1111-1111"))
        );
        for (User user: users) {
            for (String number: user.getPhoneNumbers()) {
                if (number.equals("1111-1111")){
                    System.out.println(user.getName() + ": " + user.getPhoneNumbers());
                }
            }
        }
    }
}
