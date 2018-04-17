public class Kata {

    public String getMiddle(String word) {

        int wordLenght = word.length();
        int halfWord = wordLenght / 2;
        String returnWord;

        if (wordLenght % 2 == 0) {
            returnWord = word.substring(halfWord - 1, halfWord + 1);
        } else {
            returnWord = word.substring(halfWord, halfWord + 1);
        }
        System.out.println(returnWord);

        return returnWord;
    }

}
