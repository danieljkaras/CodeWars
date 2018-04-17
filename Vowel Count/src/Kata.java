public class Kata {


    public int getCount(String str) {

        int vowelsCount = 0;
        char[] wordInChars = str.toCharArray();

        for (int i = 0; i < wordInChars.length; i++) {
            if (wordInChars[i] == 'a' || wordInChars[i] == 'e'
                    || wordInChars[i] == 'i' || wordInChars[i] == 'o'
                    || wordInChars[i] == 'u' ) {
                vowelsCount++;
            }
        }
        System.out.println("Vowels in your word is: " + vowelsCount);

        return vowelsCount;
    }
}
