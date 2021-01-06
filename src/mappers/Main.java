package mappers;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Film> filmStream = Stream.of(new Film("Age of Gods", 35.0), new Film("Assassin", 50.0));
        filmStream.map(Film::getPrice).forEach(System.out::println);

        Stream<Pizza> pizzaStream = Stream.of(new Pizza("Rock", 99));
        pizzaStream.flatMap(pizza -> Stream.of(
                String.format("Pizza: %s, price: $%d", pizza.getTitle(), pizza.getPrice()),
                String.format("HAPPY HOURS:\nPizza: %s, price: $%d", pizza.getTitle(), pizza.getPrice() / 2)
        )).forEach(System.out::println);
    }
}
