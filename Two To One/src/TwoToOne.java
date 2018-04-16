public class TwoToOne {

    String result;

    public String longest(String s1, String s2) {

        StringBuilder stringBuilder = new StringBuilder();

        (s1 + s2).chars().distinct().sorted().forEach(a -> stringBuilder.append((char) a));

        result = stringBuilder.toString();

        System.out.println(result);

        return result;

    }
}
