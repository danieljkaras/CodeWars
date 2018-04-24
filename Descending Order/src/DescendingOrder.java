import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingOrder {

    public static void main(String[] args) {

        DescendingOrder order = new DescendingOrder();
        order.sortDesc(25472);
        order.sortDesc(123456789);

    }

    public int sortDesc(int num) {

        StringBuilder builder = new StringBuilder();
        builder.append(num);

        String[] splitNumber = builder.toString().split("");
        Integer[] integers = new Integer[splitNumber.length];


        for (int i = 0; i < splitNumber.length; i++) {
            integers[i] = Integer.parseInt(splitNumber[i]);
        }

        List<Integer> integers1 = Arrays.asList(integers);

        List<Integer> collect = integers1.stream()
                .sorted((s1, s2) -> s2.intValue() - s1.intValue())
                .collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();

        for (Integer x: collect){
            sb.append(x.toString());
        }

        Integer result = Integer.parseInt(sb.toString());

        return result;
    }

}
