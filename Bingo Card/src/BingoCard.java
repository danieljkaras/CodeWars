/*
*
 *
  * Instruction:
  *
  * After yet another dispute on their game the Bingo Association decides to change course and automize the game.

Can you help the association by writing a method to create a random Bingo card?

Task:

Finish method:
BingoCard.getCard()
A Bingo card contains 24 unique and random numbers according to this scheme:
5 numbers from the B column in the range 1 to 15
5 numbers from the I column in the range 16 to 30
4 numbers from the N column in the range 31 to 45
5 numbers from the G column in the range 46 to 60
5 numbers from the O column in the range 61 to 75

The card must be returned as an array of Bingo style numbers:
{ "B14", "B12", "B5", "B6", "B3", "I28", "I27", ... }
The numbers must be in the order of their column: B, I, N, G, O. Within the columns the order of the numbers is random.
*
*
*
* */


import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class BingoCard {

    public String[] getCard() {

        Set<String> bingoTable = new LinkedHashSet<>();

        for (int i = 0; i < 24; i++) {

            if (i > 0 && i < 5) {
                while (bingoTable.size() < 5) {
                    bingoTable.add("B" + String.valueOf(new Random().nextInt(15) + 1));
                }
            }
            if (i >= 5 && i < 10) {
                while (bingoTable.size() < 10) {
                    bingoTable.add("I" + String.valueOf(new Random().nextInt(15) + 16));
                }
            }
            if (i >= 10 && i < 14) {
                while (bingoTable.size() < 14) {
                    bingoTable.add("N" + String.valueOf(new Random().nextInt(15) + 31));
                }
            }
            if (i >= 14 && i < 19) {
                while (bingoTable.size() < 19) {
                    bingoTable.add("G" + String.valueOf(new Random().nextInt(15) + 46));
                }
            }
            if (i >= 19 && i < 24) {
                while (bingoTable.size() < 24) {
                    bingoTable.add("O" + String.valueOf(new Random().nextInt(15) + 61));
                }
            }
        }

        String[] bingoCardList = bingoTable.toArray(new String[bingoTable.size()]);

        return bingoCardList;
    }
}
