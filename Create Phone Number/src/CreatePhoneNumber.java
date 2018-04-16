public class CreatePhoneNumber {

    public String createPhoneNumber(int[] numbers) {

        StringBuilder builder = new StringBuilder();

        builder.append("(");
        builder.append(numbers[0]);
        builder.append(numbers[1]);
        builder.append(numbers[2]);
        builder.append(") ");
        builder.append(numbers[3]);
        builder.append(numbers[4]);
        builder.append(numbers[5]);
        builder.append("-");
        builder.append(numbers[6]);
        builder.append(numbers[7]);
        builder.append(numbers[8]);
        builder.append(numbers[9]);

        return builder.toString();
    }
}
