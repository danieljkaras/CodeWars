//          Complete the solution so that it reverses the string value passed into it.
//
//          Kata.solution("world") //return "dlrow"



public class ReversedString {

    public String solution(String str) {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(str);
        stringBuilder.reverse();

        return stringBuilder.toString();
    }
}
