package ptbeWeek6JavaFinalCodingProject;

public class Card {

	//encapsulation and setting parameters to create new object
	private int value;
	private String name;

	
	public Card(String name, int value) {
		this.name = name;
		this.value = value;
	}	
	//describe method to print value and name of card to console
	public void describe() {
		System.out.println("Card: " + value + " " + name);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

