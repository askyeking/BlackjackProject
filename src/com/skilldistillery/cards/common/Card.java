package com.skilldistillery.cards.common;

import java.util.Objects;

public class Card {

	// FIELDS
	private Suit suit;
	private Rank rank;

	// CTORS
	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	// Getters/Setters
	public int getValue() {
		return rank.getValue();
	}
	// Other Methods

	@Override
	public int hashCode() {
		return Objects.hash(rank, suit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return rank == other.rank && suit == other.suit;
	}

	// toString()
	@Override
	public String toString() {
		return "Card [suit=" + suit + ", rank=" + rank + "]";
	}

}
