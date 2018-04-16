public class PokerKata {

    public boolean CheckIfFlush(String[] cards) {

        String[] colorCards = new String[5];
        boolean result;

        for (int i = 0; i < cards.length; i++) {
            if (cards[i].length() > 2) {
                colorCards[i] = cards[i].substring(2);
            } else {
                colorCards[i] = cards[i].substring(1);
            }
        }
        if (colorCards[0].equals(colorCards[1])
                && colorCards[0].equals(colorCards[2])
                && colorCards[0].equals(colorCards[3])
                && colorCards[0].equals(colorCards[4]))
        {
            result = true;
        } else {
            result = false;
        }
        System.out.println(result); // printer for checking result
        return result;
    }

}
