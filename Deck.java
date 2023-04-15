package Week06CodingAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards;
	
	public Deck() {
        this.cards = new ArrayList<>();
        
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        
        for (String suit : suits) {
            for (int i = 2; i <= 14; i++) {
                String name;
                switch (i) {
                    case 11:
                        name = "Jack";
                        break;
                    case 12:
                        name = "Queen";
                        break;
                    case 13:
                        name = "King";
                        break;
                    case 14:
                        name = "Ace";
                        break;
                    default:
                        name = Integer.toString(i);
                        break;
                }
                name += " of " + suit;
                Card card = new Card(i, name);
                this.cards.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cards);

}
    public Card draw() {
        if (this.cards.size() == 0) {
            return null;
        }
        return this.cards.remove(0);
        
    }
}



//b.	Deck
//i.	Fields
//1.	cards (List of Card)
//ii.	Methods
//1.	shuffle (randomizes the order of the cards)
//2.	draw (removes and returns the top card of the Cards field)
//3.	In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
