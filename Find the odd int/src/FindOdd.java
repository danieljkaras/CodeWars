import java.util.*;

public class FindOdd {

    public int findIt(int[] A) {

        Map<Integer, Integer> map = new LinkedHashMap<>();
        Map<Integer, Integer> resultMap = new TreeMap<>();

        Integer result = 0;

        for (int i = 0; i < A.length; i++) {
            map.merge(A[i], 1, Integer::sum);
        }

        for (Integer keys : map.keySet()) {
            if (map.containsKey(keys)) {
                resultMap.put(keys, (Integer) map.get(keys) % 2);
            }
        }

        for (Integer keys : resultMap.keySet()) {
            if (resultMap.get(keys) == 1) {
                result = keys;
            }
        }
        return result;
    }
}
