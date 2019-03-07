package com.deck;

public enum CardRank {

    A("A"),

    KING("King"),

    QUEEN("Queen"),

    JACK("Jack"),

    TEN("10"),

    NINE("9"),

    EIGHT("8"),

    SEVEN("7"),

    SIX("6"),

    FIVE("5"),

    FOUR("4"),

    THREE("3"),

    TWO ("2");

    String value;

    CardRank(String value) {
        this.value =  value;
    }
}
