public class Codewars {


    public static void main(String[] args) {

        Codewars codewars = new Codewars();

        codewars.oddOrEven(new int[]{2, 5, 34, 6});
    }

    public String oddOrEven(int[] array) {

        int sum = 0;
        String result;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        if (sum % 2 == 0) {
            result = "even";
        } else {
            result = "odd";
        }
        return result;
    }
}
