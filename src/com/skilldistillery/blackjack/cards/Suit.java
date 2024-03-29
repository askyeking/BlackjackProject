package com.skilldistillery.blackjack.cards;

public enum Suit {

	HEARTS("Hearts"), SPADES("Spades"), 
	CLUBS("Clubs"), DIAMONDS("Diamonds");

	private final String name;

	private Suit(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}
