package stream;

public class Card {
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    enum Suit {
        CLUB, DIAMOND, HEART, SPADE
    }

    enum Rank {
        ACE, KING, QUEEN, JACK, TEN, NINE, EIGHT, SEVEN, SIX, FIVE, FOUR, THREE, TWO
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

}
