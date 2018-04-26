//        An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).
//
//        Note: anagrams are case insensitive
//
//        Complete the function to return true if the two arguments given are anagrams of theeach other; return false otherwise.
//
//        Examples
//        "foefet" is an anagram of "toffee"
//
//        "Buckethead" is an anagram of "DeathCubeK"

import java.util.Arrays;

public class Kata {

    public static void main (String[]args){

        Kata kata = new Kata();
        kata.isAnagram("Buckethead", "DeathCubeK");
        kata.isAnagram("apple", "pale");
        kata.isAnagram("foefet", "toffee");
    }

    public boolean isAnagram(String test, String original) {

        char[] afterAnagram = test.toLowerCase().toCharArray();
        char[] beforeAnagram = original.toLowerCase().toCharArray();

        Arrays.sort(afterAnagram);
        Arrays.sort(beforeAnagram);

        boolean result = true;

        if (beforeAnagram.length != afterAnagram.length) {
            result = false;
        } else {
            for (int i = 0; i < afterAnagram.length; i++) {
                if (afterAnagram[i] == beforeAnagram[i]) {
                    result = true;
                } else {
                    result = false;
                }
            }
        }
        System.out.println(result);
        return result;
    }
}
