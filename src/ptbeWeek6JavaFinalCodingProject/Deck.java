package ptbeWeek6JavaFinalCodingProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {

	//encapsulation  and building the deck of cards using StringBuilder with card names and suits
	private List<Card> cards = new ArrayList<Card>();
	private	List<String> suits = Arrays.asList("Diamonds", "Hearts", "Clubs", "Spades");
	private List<String> names = Arrays.asList("Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine", "Ten", "Jack", "Queen", "King", "Ace");
	private StringBuilder cardNames = new StringBuilder();
	
	//this is a loop that creates the deck by looping through the suits and string of names, creating the full suit
	// and name/value of the cards and adding it to the StringBuilder.  the setLength clears the StingBuilder object
	//for each iteration of the loop
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
	
	//shuffles cards
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	//draws and returns the top card
	public Card draw() {
		return this.cards.remove(0);
	}
	//gets the length/size of the list
	public int getListSize() {
		return cards.size();
	}
}
