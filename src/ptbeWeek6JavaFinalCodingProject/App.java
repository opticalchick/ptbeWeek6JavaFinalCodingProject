package ptbeWeek6JavaFinalCodingProject;

public class App {

	public static void main(String[] args) {
		//instantiates new deck and players
		Deck deck = new Deck();
		Player player1 = new Player("Player 1");
		Player player2 = new Player ("Player 2");
		
		Card cardPlayer1;
		Card cardPlayer2;
		
		int deckSize = deck.getListSize();
		int handSize;
		//shuffles deck
		deck.shuffle();
		
		//loop to deal deck to players			
		for (int i = 0; i < deckSize; i++) {
			if (i % 2 ==0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		
		System.out.println("Let's Play War!");
		
		handSize = player1.getCardsInHandSize();
		//loop to iterate through each round, as long as each player has cards in hand		
		for(int round = 0; round <handSize; round++) {
			cardPlayer1 = player1.flip();
			cardPlayer2 = player2.flip();
		//prints card played by each player		
		System.out.println("\n\n Card Played by Each Player: ");
		System.out.print("Player 1's ");
		cardPlayer1.describe();
		System.out.print("Player 2's ");
		cardPlayer2.describe();
		// compares the values of each player's card and increments score appropriately
		if (cardPlayer1.getValue() > cardPlayer2.getValue()) {
			player1.incrementScore();
			System.out.println("\nPlayer 1 wins this round.");			
		} else if (cardPlayer1.getValue() < cardPlayer2.getValue()) {
			player2.incrementScore();
			System.out.println("\nPlayer 2 wins this round.");
		} else {
			System.out.println("\nThis round was a tie.");
		}
		//prints current scores
		System.out.println("\nCurrent Scores: ");
		System.out.printf("Player 1's score: " + player1.getScore() + "    Player 2's score: " + player2.getScore());
		}
		
		//checks at end of game for winner or if a tie
		if (player1.getScore() > player2.getScore()) {
			System.out.println("\n\n\nPlayer 1 is the winner!");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("\n\n\nPlayer 2 is the winner!");
		} else  if (player1.getScore() == player2.getScore()){
			System.out.println("\n\n\nIt's a tie!");
		} 
		
	}
}
