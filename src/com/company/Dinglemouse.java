package com.company;

public class Dinglemouse {

    public int[] humanYearsCatYearsDogYears(int humanYears) {

        int catYears = 1;
        int dogYears = 1;

        for (int i = 1; i <= humanYears; i++) {

            if (i == 1) {
                catYears = catYears + 14;
                dogYears = dogYears + 14;
            }
            if (i == 2) {
                catYears = catYears + 9;
                dogYears = dogYears + 9;
            }
            if (i > 2) {
                catYears = catYears + 4;
                dogYears = dogYears + 5;

            }


        }

        System.out.println("Human year: " + humanYears + " Cat years: " + catYears + " Dog years: " + dogYears);
        return new int[]{humanYears, catYears, dogYears};


    }
}
