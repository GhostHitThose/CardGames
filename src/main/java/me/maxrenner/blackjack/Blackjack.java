package me.maxrenner.blackjack;

import me.maxrenner.cards.Deck;

// IMPORTANT
// !THIS IS A SINGLETON CLASS!
public class Blackjack {
    private static Blackjack blackjack;

    public static Blackjack getInstance() {
        if(blackjack == null) blackjack = new Blackjack();

        return blackjack;
    }

    private Blackjack(){
        System.out.println("+----------------------+");
        System.out.println("| Welcome To Blackjack |");
        System.out.println("+----------------------+");

        Deck deck = new Deck();
        deck.buildDecks();
        deck.shuffleDeck();
        System.out.println(deck);
    }
}
