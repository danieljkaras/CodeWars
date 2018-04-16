//*
// Instructions:
//
// Simple, remove the spaces from the string, then return the resultant string.
//
//
// */

public class RemoveStringSpaces {

    public String noSpace(String x) {

        String[] tab = x.split(" ");

        StringBuilder builder = new StringBuilder();

        for (String word : tab) {
            builder.append(word);
        }
        String result = builder.toString();

        return result;
    }
}
