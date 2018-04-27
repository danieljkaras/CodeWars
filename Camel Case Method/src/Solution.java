public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();

        solution.camelCase("camel case word");
        solution.camelCase("z");

    }

    public String camelCase(String str) {

        String[] stringArray = str.split(" ");
        StringBuilder sb = new StringBuilder();
        String temp;

        for (int i = 0; i < stringArray.length; i++) {
            temp = stringArray[i];

            if (temp.isEmpty()) {
                continue;
            } else if (temp.length() == 1) {
                sb.append(temp.substring(0, 1).toUpperCase());
            } else {
                sb.append(temp.substring(0, 1).toUpperCase());
                sb.append(temp.substring(1));
            }
        }
        return sb.toString();
    }
}
