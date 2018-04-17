import java.util.ArrayList;
import java.util.List;

public class Kata {

    public long numberOfDivisors(int n) {

        List<Integer> divisorsForNumber = new ArrayList<>();
        int counter = n;

        for (int i = counter; i > 0; i--) {
            if (n % i == 0) {
                divisorsForNumber.add(i);
            }
        }
        int size = divisorsForNumber.size();
        System.out.println("You have total " + size + " divisors.");
        return size;
    }
}


