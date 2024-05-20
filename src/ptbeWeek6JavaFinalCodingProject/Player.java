package ptbeWeek6JavaFinalCodingProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//encapsulation and creating new hand for cards, setting variables for score and name
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
		
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}
	//describes the cards in each player's hand
	public void describe() {
		System.out.println(this.name + "'s Cards: ");
		for (Card card : this.hand) {
			card.describe();
		}
	}
	//removes and returns top card from player's hand
	public Card flip() {
		return this.hand.remove(0);
	}
	//draws card from deck
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	//increments score for winner of each round
	public int incrementScore() {
		return score++;
	}
	//gets the score for each player
	public int getScore() {
		return this.score; 
	}
	
	public int getCardsInHandSize() {
		return hand.size();
	}
}
