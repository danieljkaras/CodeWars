package com.company.RemoveFirstAndLastLetter;

public class RemoveLetter {

    public static void main(String[] args) {

        RemoveLetter removeLetter = new RemoveLetter();
        System.out.println(removeLetter.remove("domination"));

    }


    private String remove(String str) {

//
//        char[] someWord = str.toCharArray();
//        someWord[0] =' ';
//        someWord[str.length()-1] =' ';
//
//        String newWord =" ";
//
//        for (char x: someWord)
//            newWord +=x;
//
//        newWord = newWord.trim();

        return str.substring(1, str.length()-1);
    }
}

