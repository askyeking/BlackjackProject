package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards;

	
	public Deck() {
		cards = createDeck();
	}
	
	private List<Card> createDeck() {
		cards = new ArrayList<>();
		for(Suit suit: Suit.values()) {
			for(Rank rank : Rank.values()) {
				cards.add(new Card(rank,suit));
			}
		}
		return cards;
	}
	
	public int checkDeckSize() {
		return this.cards.size();
	}
	
	public Card dealCard() {	
		return cards.remove(0);
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	
	
}
