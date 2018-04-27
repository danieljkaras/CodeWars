public class NumberFun {

    public static void main(String[] args) {

        NumberFun fun = new NumberFun();

        fun.findNextSquare(625);
        fun.findNextSquare(114);
    }

    public long findNextSquare(long sq) {

        long result = 0;
        long temp = 0;

        if (Math.sqrt(sq) % 1 == 0) {
            temp = (long) Math.sqrt(sq);
            result = (long) Math.pow(temp + 1, 2);
        } else {
            result = -1;
        }
        return result;
    }
}
