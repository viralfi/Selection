package com.vialfinaz14.Chapter7_ArraySingleDimens.Tugas;

public class Exercises24_CouponCollectorsProblem {
    public static void main(String[] args) {
        int[] deck = new int[52];
        int[] pick = new int[4];

        for (int i = 0; i < deck.length; i++)
            deck[i] = i;
        shufflecard(deck);
            int count = 0;
            do {
                pickcard(deck, pick);
                count++;
            }while (!isoneofeachsuit(pick));
            print(pick);
            System.out.println("Number of picks: " + count);
    }
    public static void shufflecard(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int index = pickcard(deck);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
    }
    public static void pickcard(int[] deck, int[] pick) {
        for (int i = 0; i < pick.length; i++) {
            pick[i] = deck[pickcard(deck)];
        }
    }
    public static int pickcard(int[] deck) {
        return (int) (Math.random() * deck.length);
    }
    public static boolean isoneofeachsuit(int[] pick) {
        for (int i = 0; i < pick.length; i++) {
            for (int j = 0; j < pick.length; j++) {
                if (i != j && (pick[i] / 13 == pick[j] / 13))
                    return false;
            }
        }
        return true;
    }
    public static void print(int[] pick) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King"};

        for (int i = 0; i < pick.length; i++) {
            System.out.println(ranks[pick[i] % 13] +
                    " of " + suits[pick[i] / 13]);
        }
    }
}
