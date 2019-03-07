package com.deck;

import java.util.Optional;

public class DeckOfCards {
    /**
     * Number of cards in deck.
     */
    public static final int NCARDS = 52;

    private Card[] deckOfCards;
    private int currentCard;

    public DeckOfCards() {
        deckOfCards = new Card[NCARDS];
        int i = 0;
        for (CardRank rank : CardRank.values()) {
            for (Suite suite : Suite.values()) {
               deckOfCards[i++] = new Card(suite, rank);
            }
        }
        currentCard = 0;
    }


    /**
     * Shuffle the deck.
     */
    public void shuffle() {
        int i, j;
        for (int num = 0; num < NCARDS; num ++) {
            i = (int) ( NCARDS * Math.random());  // Pick 2 random cards
            j = (int) ( NCARDS * Math.random());  // in the deck
            // swap random cards
            Card tmp = deckOfCards[i];
            deckOfCards[i] = deckOfCards[j];
            deckOfCards[j] = tmp;;
        }
        currentCard = 0;   // Reset current card to deal
    }

    /**
     * Deal one card
     * @return  card.
     */
    public Card dealOneCard() {
        if ( currentCard < NCARDS ) {
            return ( deckOfCards[ currentCard++ ] );
        } else {
            System.out.println("No More cards in Deck");
            return ( null );  // Error;
        }
    }

}