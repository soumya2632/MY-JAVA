package com.java.project.Card_Deck;

	import java.util.*;
	class Card implements Comparable<Card> {
	        enum Suit {
	            CLUBS, DIAMONDS, HEARTS, SPADES
	        }

	        enum Rank {
	            TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN,
	            JACK, QUEEN, KING, ACE
	        }

	        private final Suit suit;
	        private final Rank rank;

	        public Card(Suit suit, Rank rank) {
	            this.suit = suit;
	            this.rank = rank;
	        }

	        public Suit getSuit() {
	            return suit;
	        }

	        public Rank getRank() {
	            return rank;
	        }

	        @Override
	        public int compareTo(Card other) {
	            if (this.suit != other.suit) {
	                return this.suit.ordinal() - other.suit.ordinal();
	            }
	            return this.rank.ordinal() - other.rank.ordinal();
	        }

	        @Override
	        public String toString() {
	            return rank + " of " + suit;
	        }
	    }

	    class deck {
	        private final List<Card> cards;
	        private final Random rand;

	        public deck() {
	            cards = new ArrayList<>();
	            rand = new Random();
	            initializeDeck();
	        }

	        private void initializeDeck() {
	            for (Card.Suit suit : Card.Suit.values()) {
	                for (Card.Rank rank : Card.Rank.values()) {
	                    cards.add(new Card(suit, rank));
	                }
	            }
	        }

	        public void shuffle() {
	            Collections.shuffle(cards, rand);
	        }

	        public Card drawRandomCard() {
	            if (cards.isEmpty()) {
	                System.out.println("No more cards to draw.");
	                return null;
	            }
	            return cards.remove(rand.nextInt(cards.size()));
	        }

	        public void sort() {
	            Collections.sort(cards);
	        }

	        public void printDeck() {
	            for (Card card : cards) {
	                System.out.println(card);
	            }
	        }

	        public int size() {
	            return cards.size();
	        }
	    }

	public class DeckOfCard {
	    public static void main(String[] args) {
	        deck deck = new deck();

	        System.out.println("Initial deck:");
	        deck.printDeck();

	        System.out.println("\nShuffling deck...");
	        deck.shuffle();
	        deck.printDeck();

	        System.out.println("\nDrawing a random card:");
	        Card drawn = deck.drawRandomCard();
	        System.out.println("You drew: " + drawn);
	        System.out.println("Remaining cards: " + deck.size());

	        System.out.println("\nSorting remaining cards...");
	        deck.sort();
	        deck.printDeck();
	    }
	}




