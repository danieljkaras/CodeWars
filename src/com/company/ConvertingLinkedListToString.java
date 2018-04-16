package com.company;

public class ConvertingLinkedListToString {

    public static String stringify(Node list) {






        String stringifyStream = stringifyStream = String.valueOf(list.getData()) + " -> " + String.valueOf(list.getNext().getData()) +
                " -> " + String.valueOf(list.getNext().getNext().getData()) + " ->" + " null";


        return stringifyStream;
    }


}
