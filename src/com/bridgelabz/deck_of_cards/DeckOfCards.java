package com.bridgelabz.deck_of_cards;

public class DeckOfCards {
    public static void main(String[] args) {
        DistributeCards distributeCards = new DistributeCards();

        for (int playerNumber = 1; playerNumber <= 4; playerNumber++) {
            distributeCards.DistributeCards(playerNumber);
            System.out.println("Player "  + playerNumber + "'s cards:");
            distributeCards.showCards(playerNumber);
        }
    }
}