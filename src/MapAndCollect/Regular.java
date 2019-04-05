package MapAndCollect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Regular {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kamm", "Alves", "Natan", "Silva");
        List<User> userList = new ArrayList<>();

        for (String name : names) {
            if (!name.equals("Kamm")){
                User user = new User(name);
                userList.add(user);
            }
        }

        for (User user: userList) {
            System.out.println(user);
        }

    }
}


