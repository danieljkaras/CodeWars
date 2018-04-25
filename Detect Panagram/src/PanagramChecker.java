import java.util.HashSet;
import java.util.Set;

public class PanagramChecker {

    public static void main(String[] args) {

        PanagramChecker checker = new PanagramChecker();
        checker.check("The quick brown fox jumps over the lazy dog.");

    }

    public boolean check(String sentence) {

        Set<Character> uniqeSet = new HashSet<>();
        char[] chars = sentence.toUpperCase().toCharArray();
        boolean result;

        for (Character x : chars) {
            uniqeSet.add(x);
        }

        if (uniqeSet.size() >= 26) {
            result = true;
        } else {
            result = false;
        }
        System.out.println(result);
        return result;
    }
}
