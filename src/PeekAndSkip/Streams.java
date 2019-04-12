package PeekAndSkip;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        List<String> a = Stream.of("One","Two","Three")
                .filter(item ->!item.equals("One"))
                .peek(item -> System.out.println("Peeking: " + item))
                .collect(Collectors.toList());

        IntStream.of(1,33,12,5,2,7)
                .skip(2) // Skip '1' and '33', two positions
                .filter(i -> i >5 )
                .forEach(System.out::println);
    }
}
