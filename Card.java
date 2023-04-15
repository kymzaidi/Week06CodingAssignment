package Week06CodingAssignment;

public class Card {
	
	private int value;
	private String name;
	
	public Card(int value, String name) {
		this.setValue(value);
		this.setName(name);
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
        System.out.println("Card name: " + this.name);
        System.out.println("Card value: " + this.value);
    }

}


//*a.	Card
//i.	Fields
//1.	value (contains a value from 2-14 representing cards 2-Ace)
//2.	name (e.g. Ace of Diamonds, or Two of Hearts)

//ii.	Methods
//1.	Getters and Setters
//2.	describe (prints out information about a card)
