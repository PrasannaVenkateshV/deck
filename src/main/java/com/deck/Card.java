package com.deck;


public class Card {

    private Suite suite;


    private CardRank rank;

    Card (Suite suite, CardRank rank) {
        this.suite = suite;
        this.rank =  rank;
    }


    public Suite getSuite() {
        return suite;
    }


    public CardRank getRank() {
        return rank;
    }


    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }
        if (!(o instanceof Card)) {
            return false;
        }
        // typecast o to Complex so that we can compare data members
        Card c = (Card) o;
        if (this.suite.equals(((Card) o).suite) && this.rank.equals(((Card) o).rank)) {
            return true;

        }
        return false;
    }


}
