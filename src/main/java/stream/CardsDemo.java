package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class CardsDemo {
    public static void main(String[] args) {
        List<Card> cards = newDeck1();


    }

    private static List<Card> newDeck1() {
        List<Card> result = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values())
            for (Card.Rank rank : Card.Rank.values())
                result.add(new Card(suit, rank));
        return result;
    }

    private static List<Card> newDeck2() {
        return Stream.of(Card.Suit.values())
                .flatMap(suit ->
                        Stream.of(Card.Rank.values())
                                .map(rank -> new Card(suit, rank)))
                .collect(toList());
    }
}
