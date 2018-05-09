import java.util.ArrayList;
import java.util.List;

public class Kata {

    public static void main(String[] args) {

        Kata kata = new Kata();

        kata.abundantNumber(12);
    }

    public boolean abundantNumber(int n) {

        List<Integer> divisors = properDivisors(n);
        int sum = 0;
        boolean result;
        for (int i = 0; i < divisors.size(); i++) {
            sum += divisors.get(i);
        }

        if (sum > n) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    private List<Integer> properDivisors(int n) {

        List<Integer> divisorForNumber = new ArrayList<>();
        int counter = n - 1;

        for (int i = counter; i > 0; i--) {
            if (n % i == 0) {
                divisorForNumber.add(i);
            }
        }
        return divisorForNumber;
    }
}
