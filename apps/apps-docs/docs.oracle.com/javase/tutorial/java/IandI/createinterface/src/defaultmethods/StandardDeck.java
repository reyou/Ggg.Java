package defaultmethods;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class StandardDeck implements Deck {
    @Override
    public List<Card> getCards() {
        return null;
    }

    @Override
    public Deck deckFactory() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void addCard(Card card) {

    }

    @Override
    public void addCards(List<Card> cards) {

    }

    @Override
    public void addDeck(Deck deck) {

    }

    @Override
    public void shuffle() {

    }

    private List<Card> entireDeck;

    @Override
    public void sort() {
        Collections.sort(entireDeck);
    }

    @Override
    public void sort(Comparator<Card> c) {

    }

    @Override
    public String deckToString() {
        return null;
    }

    @Override
    public Map<Integer, Deck> deal(int players, int numberOfCards) throws IllegalArgumentException {
        return null;
    }
}
