public class Kata {

    public static void main(String[] args) {

        Kata kata = new Kata();
        kata.getIssuer("378282246310005");
        kata.getIssuer("9111111111111111");
    }

    public String getIssuer(String cardNumber) {

        StringBuilder builder = new StringBuilder();

        if (cardNumber.length() == 15 && (cardNumber.startsWith("34") || cardNumber.startsWith("37"))) {
            builder.append("AMEX");
        } else if (cardNumber.length() == 16 && cardNumber.startsWith("6011")) {
            builder.append("Discover");
        } else if (cardNumber.length() == 16 && (cardNumber.startsWith("51") || cardNumber.startsWith("52")
                || cardNumber.startsWith("53") || cardNumber.startsWith("54") || cardNumber.startsWith("55"))) {
            builder.append("Mastercard");
        } else if (cardNumber.startsWith("4") && ((cardNumber.length() == 13) || cardNumber.length() == 16)) {
            builder.append("VISA");
        } else {
            builder.append("Unknown");
        }
        return builder.toString();
    }


}
