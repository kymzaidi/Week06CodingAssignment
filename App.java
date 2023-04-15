package Week06CodingAssignment;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deck deck = new Deck();
        deck.shuffle();
        
        Player Kym = new Player("Player 1");
        Player Ali = new Player("Player 2");
        
        // draw 52 cards and give half to each player
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                Kym.draw(deck);
            } else {
                Ali.draw(deck);
            }
        }
        
        // flip cards and increment scores for each player
        for (int i = 0; i < 26; i++) {
            Card card1 = Kym.flip();
            Card card2 = Ali.flip();
            
            System.out.println("Player 1 flipped: ");
            card1.describe();
            System.out.println("Player 2 flipped: ");
            card2.describe();
            
            if (card1.getValue() > card2.getValue()) {
                Kym.incrementScore();
                System.out.println("Player 1 wins this round!");
            } else if (card2.getValue() > card1.getValue()) {
                Ali.incrementScore();
                System.out.println("Player 2 wins this round!");
            } else {
                System.out.println("It's a tie!");
            }
            
            System.out.println("Current score: ");
            System.out.println("Player 1: " + (Kym).getScore());
            System.out.println("Player 2: " + (Ali).getScore());
        }
        
        // determine the winner
        int score1 = Kym.getScore();
        int score2 = Ali.getScore();
        String winner;
        if (score1 > score2) {
            winner = "Player 1";
        } else if (score2 > score1) {
            winner = "Player 2";
        } else {
            winner = "Draw";
        }
        
        // print the final score and winner
        System.out.println("Final score: ");
        System.out.println("Player 1: " + score1);
        System.out.println("Player 2: " + score2);
        System.out.println("Winner: " + winner);
    }

}


//2.	Create a class called App with a main method.
//a)	Instantiate a Deck and two Players, call the shuffle method on the deck.
//b)	Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
//c)	Using a traditional for loop, iterate 26 times and call the flip method for each player.
//d)	Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.
//e)	After the loop, compare the final score from each player. 
//f)	Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.

