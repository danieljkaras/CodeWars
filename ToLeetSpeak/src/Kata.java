import java.util.LinkedHashMap;
import java.util.Map;

public class Kata {

    public static void main(String[] args) {

        Kata kata = new Kata();
        System.out.println(kata.toLeetSpeak("LEET"));
    }

    public String toLeetSpeak(String speak) {

        Map<String, String> alphabetMap = decode();
        char[] speakTable = speak.toCharArray();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < speakTable.length; i++) {
            if (speakTable[i] == ' ') {
                builder.append(' ');
            } else {
                builder.append(alphabetMap.get(String.valueOf(speakTable[i])));
            }
        }
        return builder.toString();
    }

    private Map<String, String> decode() {

        String map = "A:@,B:8,C:(,D:D,E:3,F:F,G:6,H:#,I:!,J:J,K:K,L:1,M:M,N:N,O:0,P:P,Q:Q,R:R,S:$,T:7,U:U,V:V,W:W,X:X,Y:Y,Z:2";
        Map<String, String> decodingMap = new LinkedHashMap<>();

        String[] pairs = map.split(",");

        for (int i = 0; i < pairs.length; i++) {
            String pair = pairs[i];
            String[] keyValue = pair.split(":");
            decodingMap.put(keyValue[0], keyValue[1]);
        }
        return decodingMap;
    }
}
