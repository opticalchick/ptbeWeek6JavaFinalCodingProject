package ptbeWeek6JavaFinalCodingProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> cards = new ArrayList<Card>();
	private	List<String> suits = Arrays.asList("Diamonds", "Hearts", "Clubs", "Spades");
	private List<String> names = Arrays.asList("Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine", "Ten", "Jack", "Queen", "King", "Ace");
	private StringBuilder cardNames = new StringBuilder();
	
	public Deck() {
		for (String suit : suits) {
			int counter = 2;
			for (String name : names) {
				cardNames.setLength(0);
				cardNames.append(name + " of " + suit);
				cards.add(new Card(cardNames.toString(), counter));
				counter++;
			}
		}
	}
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public Card draw() {
		return this.cards.remove(0);
	}
	
	public int getListSize() {
		return cards.size();
	}
}
