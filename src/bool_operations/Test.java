package bool_operations;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream<Integer> allMatchStream = Stream.of(-1, -2, 0, 1, 2);
        System.out.println(allMatchStream.allMatch(value -> value >= 0 ));

        Stream<Integer> anyMatchStream = Stream.of(-1, 0, 1, 2, 3);
        System.out.println(anyMatchStream.anyMatch(value -> value < 0));

        Stream<Integer> noneMatchStream = Stream.of(0, 1, 2, 3, 4, 5);
        System.out.println(noneMatchStream.noneMatch(value -> value < 0));
    }
}
