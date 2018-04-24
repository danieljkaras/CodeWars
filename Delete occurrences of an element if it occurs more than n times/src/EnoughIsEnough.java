import java.util.ArrayList;
import java.util.List;

public class EnoughIsEnough {


    public static void main(String[] args) {

        int[] elements = {1, 1, 3, 3, 7, 2, 2, 2, 2};
        int occurences = 3;

        EnoughIsEnough enough = new EnoughIsEnough();

//        System.out.println(enough.deleteNth(elements, occurences).toString());


    }


    public int[] deleteNth(int[] elements, int maxOccurrences) {

        List<Integer> enterData = new ArrayList<>();

        for (Integer x : elements) {
            enterData.add(x);
        }

//        System.out.println(elements);
        System.out.println(enterData);


//        int[] counter = new int[20];
//        int[] numberCounter = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//
//        for (int i = 0; i < elements.length - 1; i++) {
//            for (int j = 0; j < numberCounter.length; j++)
//                if (elements[i] == elements[i + 1]) {
//                    numberCounter[j]++;
//                    System.out.println(numberCounter[j]);
//                }
//        }
//        System.out.println(numberCounter);


        return null;
    }


}
