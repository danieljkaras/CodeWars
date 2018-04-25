import java.util.Arrays;

/*Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.

        Notes:

        Only lower case letters will be used (a-z). No punctuation or digits will be included.
        Performance needs to be considered
        Examples
        scramble('rkqodlw', 'world') ==> True
        scramble('cedewaraaossoqqyt', 'codewars') ==> True
        scramble('katas', 'steak') ==> False */


public class Scramblies {

    public static void main(String[] args) {

        Scramblies scramblies = new Scramblies();
        scramblies.scramble("rkqodlw", "world");
        scramblies.scramble("katas", "steak");
        scramblies.scramble("aabbcamaomsccdd", "commas");
        scramblies.scramble("scriptjavx", "javascript");
    }

    public boolean scramble(String str1, String str2) {

        char[] letter1 = str1.toCharArray();
        char[] letter2 = str2.toCharArray();

        boolean result = false;
        int counter = 0;

        Arrays.sort(letter1);
        Arrays.sort(letter2);

        for (int i = 0; i < letter2.length; i++) {
            for (int j = 0; j < letter1.length; j++) {
                if (letter1[j] == letter2[i]) {
                    counter++;
                    letter2[i] = ' ';
                    letter1[j] = ' ';
                }
            }
        }
        if (letter2.length == counter) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
