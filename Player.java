package Week06CodingAssignment;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand;
    private int score;
    private String name;
    
    public Player(String name) {
        this.hand = new ArrayList<>();
        this.score = 0;
        this.name = name;
    }
    
    public void describe() {
        System.out.println("Player: " + this.name);
        System.out.println("Score: " + this.score);
        System.out.println("Hand: ");
        for (Card card : this.hand) {
            card.describe();
        }
    }
    
    public Card flip() {
        return this.hand.remove(0);
    }
    
    public void draw(Deck deck) {
        Card drawnCard = deck.draw();
        this.hand.add(drawnCard);
    }
    
    public void incrementScore() {
        this.score++;
    }

	public int getScore() {
		// TODO Auto-generated method stub
		return this.score;
	}
}



//c.	Player
//i.	Fields
//1.	hand (List of Card)
//2.	score (set to 0 in the constructor)
//3.	name
//ii.	Methods
//1.	describe (prints out information about the player and calls the describe method for each card in the Hand List)
//2.	flip (removes and returns the top card of the Hand)
//3.	draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
//4.	incrementScore (adds 1 to the Player’s score field)
