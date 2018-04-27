public class Kata {

    public static void main(String[] args) {

        Kata kata = new Kata();

        kata.repeatStr(3, "I");
        kata.repeatStr(5, "Hello");
    }

    public String repeatStr(int repeat, String string) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < repeat; i++) {
            builder.append(string);
        }
        return builder.toString();
    }
}
