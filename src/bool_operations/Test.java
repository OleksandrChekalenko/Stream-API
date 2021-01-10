package bool_operations;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream<Integer> allMatchStream = Stream.of(-1, -2, 0, 1, 2);
        System.out.println(allMatchStream.allMatch(value -> value >= 0));

        Stream<Integer> anyMatchStream = Stream.of(-1, 0, 1, 2, 3);
        System.out.println(anyMatchStream.anyMatch(value -> value < 0));

        Stream<Integer> noneMatchStream = Stream.of(0, 1, 2, 3, 4, 5);
        System.out.println(noneMatchStream.noneMatch(value -> value < 0));

        Stream<Integer> countStream = Stream.of(-1, -2, 0, 1, 2);
        System.out.println(countStream.count());

        ArrayList<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket("A", 100));
        tickets.add(new Ticket("B", 75));

        Ticket minTicketPrice = tickets.stream().min(Ticket::compare).get();
        System.out.printf("Minimum price of ticket class %s: $%d%n", minTicketPrice.getTicketClass(), minTicketPrice.getPrice());

        Ticket maxTicketPrice = tickets.stream().max(Ticket::compare).get();
        System.out.printf("Maximum price of ticket class %s: $%d%n", maxTicketPrice.getTicketClass(), maxTicketPrice.getPrice());

        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
       /* Optional<Integer> result = numbers.reduce(Integer::sum);
        System.out.println(result.get());*/
        /*int result = numbers.reduce(-2, Integer::sum);
        System.out.println(result);*/

        int result = numbers.reduce(3, (value1, value2) -> {
            if (value2 < 5) {
                return value1 + value2;
            } else
                return value1;
        }, Integer::sum);
//        int result = numbers.filter(valeu -> valeu < 5).reduce(3, Integer::sum);

        System.out.println(result);

    }
}
