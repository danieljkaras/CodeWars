public class LuckyNumber {

    public boolean isLucky(long n) {

        int sum = String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .sum();

        boolean result;

        if (sum == 0 || sum % 9 == 0) {
            System.out.println("You are lucky man!!");
            result = true;
        } else {
            System.out.println("You are not lucky man!!!");
            result = false;
        }
        return result;
    }

}
