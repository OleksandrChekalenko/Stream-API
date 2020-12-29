import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-2, -1, 0, 1, 2};
        for (int i : arr) {
            if (i < 0) {
                System.out.println(i);
            }
        }

        IntStream.of(arr).filter(value -> value < 0).forEach(System.out::println);
    }
}
