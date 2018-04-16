public class ReverseWords {

    String somePhrase = "The greatest victory is that which requires no battle";

    public String reverseWords(String str) {

        String[] tabBeforeReverse = str.split("\u0020");
        String[] tabAfterReverse = new String[tabBeforeReverse.length];

        for (int i = 0; i < tabAfterReverse.length; i++) {
            tabAfterReverse[i] = tabBeforeReverse[tabBeforeReverse.length - i - 1];
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < tabAfterReverse.length; i++) {
            if (i < tabAfterReverse.length - 1) {
                builder.append(tabAfterReverse[i] + " ");
            } else {
                builder.append(tabAfterReverse[i]);
            }
        }

        String result = builder.toString();
        System.out.println(result);
        return result;
    }
}
