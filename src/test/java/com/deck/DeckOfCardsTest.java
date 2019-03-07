package com.deck;


import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class DeckOfCardsTest {


    /**
     * test for deck of cards constructor.
     */
    @Test
    public void testInit() throws Exception {
        DeckOfCards deck = new DeckOfCards();
        Field deckOfCardsArrayField = DeckOfCards.class.getDeclaredField("deckOfCards");
        deckOfCardsArrayField.setAccessible(true);
        Card[] testArray = (Card[]) deckOfCardsArrayField.get(deck);
        Assert.assertEquals(testArray.length, 52);
        Set<Card> cardSet = new HashSet<Card>(Arrays.asList(testArray));
        Assert.assertEquals(cardSet.size(), 52); // 52 unique cards in the set.

    }

    /**
     * test for deck of cards constructor.
     */
    @Test
    public void testShuffle() throws Exception {
        DeckOfCards deck = new DeckOfCards();
        Field deckOfCardsArrayField = DeckOfCards.class.getDeclaredField("deckOfCards");
        deckOfCardsArrayField.setAccessible(true);
        Card[] testArray = (Card[]) deckOfCardsArrayField.get(deck);
        Random random = new Random();
        int randomIndex1 = random.nextInt(51);
        int randomIndex2 = random.nextInt(51);
        Card cardN1 =  testArray[randomIndex1];
        Card cardN2 =  testArray[randomIndex2];
        deck.shuffle(); // shuffle
        Card cardN3 =  testArray[randomIndex1];
        Card cardN4 =  testArray[randomIndex2];
        Assert.assertNotSame(cardN1, cardN3);
        Assert.assertNotSame(cardN2, cardN4);
    }


    /**
     * test for deck of cards constructor.
     */
    @Test
    public void testDealOneCard() throws Exception {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        Card[] testDeck =  new Card[52];
        for (int i = 0; i < 52; i ++) {
            testDeck[i] = deck.dealOneCard();
        }
        Assert.assertEquals(testDeck.length, 52);
        Card card = deck.dealOneCard();
        Assert.assertNull(card); // the 53rd card should be null.

    }
}
