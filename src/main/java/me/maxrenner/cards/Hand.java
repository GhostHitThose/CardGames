package me.maxrenner.cards;

import java.util.ArrayList;

public class Hand {
    private final ArrayList<Card> hand;

    public Hand() {
        hand = new ArrayList<>();
    }
    public void addToHand(Card card) {
        hand.add(card);
    }
    public void clearHand(){
        hand.clear();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(Card card : hand){
            sb.append(card.getRankLabel());
            sb.append(card.getSuitLabel());
            sb.append("  ");
        }

        return sb.toString();
    }
}
