package com.company;

public class ATM {

    public int solve(int n) {

        int notesNumber = 0;
        int rest = n;

        do {
            if (rest > 500) {
                rest = rest % 500;
                notesNumber++;
            } else if (rest >= 200 && rest <= 500) {
                rest = rest % 200;
                notesNumber++;
            } else if (rest >= 100 && rest < 200) {
                rest = rest % 100;
                notesNumber++;
            } else if (rest >= 50 && rest < 100) {
                rest = rest % 50;
                notesNumber++;
            } else if (rest >= 20 && rest < 50) {
                rest = rest % 20;
                notesNumber++;
            } else if (rest >= 10 && rest < 20) {
                rest = rest % 10;
                notesNumber++;
            } else if (rest < 10) {

                break;

            }


        } while (rest >= 0);

        if (rest < 10 && rest != 0) {
            return -1;
        } else {
            return notesNumber;
        }
    }
}

