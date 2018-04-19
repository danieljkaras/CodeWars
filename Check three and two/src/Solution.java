public class Solution {

    public static void main(String[] args) {

        boolean b = checkThreeAndTwo(new char[]{'a', 'a', 'a', 'b', 'b'});
        boolean c = checkThreeAndTwo(new char[]{'a', 'a', 'a', 'a', 'a'});
        System.out.println(b);
        System.out.println(c);
    }

    public static boolean checkThreeAndTwo(char[] chars) {

        int countA = 0;
        int countB = 0;
        int countC = 0;

        boolean result = false;

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == 'a') {
                countA++;
            } else if (chars[i] == 'b') {
                countB++;
            } else if (chars[i] == 'c') {
                countC++;
            }
        }

        if (countA == 3) {
            if (countB == 2 || countC == 2) {
                result = true;
            }
        }
        if (countB == 3) {
            if (countA == 2 || countC == 2) {
                result = true;
            }
        }
        if (countC == 3) {
            if (countA == 2 || countB == 2) {
                result = true;
            }
        }
        return result;
    }
}
