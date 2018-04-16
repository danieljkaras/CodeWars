public class Main {

    public static void main(String[] args) {

        String[] somecards = {"AS", "3S", "9S", "KS", "4S"};
        String[] somecards1 = {"AD", "4S", "7H", "KC", "5S"};

        PokerKata pokerKata = new PokerKata();

        pokerKata.CheckIfFlush(somecards);
        pokerKata.CheckIfFlush(somecards1);

    }
}
