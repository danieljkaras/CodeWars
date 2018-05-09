import java.util.ArrayList;
import java.util.List;

public class Kata {

    public static void main(String[] args) {

        Kata kata = new Kata();
        kata.numberOfDivisors(77);


    }

    public long numberOfDivisors(int n) {

        List<Integer> divisorsForNumber = new ArrayList<>();
        int counter = n-1;

        for (int i = counter; i > 0; i--) {
            if (n % i == 0) {
                divisorsForNumber.add(i);
            }
        }
        int size = divisorsForNumber.size();
        System.out.println("You have total " + size + " divisors.");
        System.out.println(divisorsForNumber);
        return size;
    }
}


