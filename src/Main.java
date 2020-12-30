import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
       /* int[] arr = {-2, -1, 0, 1, 2};
        for (int i : arr) {
            if (i < 0) {
                System.out.println(i);
            }
        }

        IntStream.of(arr).filter(value -> value < 0).forEach(System.out::println);*/

        Stream<String> objectStream = Arrays.stream(new String[]{"a", "b", "c"});
        objectStream.forEach(System.out::println);
        Stream<String> objectStream1 = Stream.of("a", "b", "c");
        objectStream1.forEach(System.out::println);

        IntStream intStream = Arrays.stream(new int[]{1, 2, 3});
        intStream.forEach(System.out::println);
        IntStream intStream1 = IntStream.of(1, 2, 3);
        intStream1.forEach(System.out::println);

        LongStream longStream1 = Arrays.stream(new long[]{3, 4, 5});
        longStream1.forEach(System.out::println);
        LongStream longStream = LongStream.of(3, 4, 5);
        longStream.forEach(System.out::println);

        DoubleStream doubleStream = Arrays.stream(new double[]{6.0, 7.2, 8.7});
        doubleStream.forEach(System.out::println);
        DoubleStream doubleStream1 = DoubleStream.of(6.0, 7.2, 8.7);
        doubleStream1.forEach(System.out::println);

        ArrayList<String> names = new ArrayList<>();
        Collections.addAll(names, "Joe", "Jack", "Linda");
        names.stream().filter(value -> value.length() >= 4).forEach(System.out::println);
    }
}
