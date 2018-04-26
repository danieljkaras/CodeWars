



public class Arge {

    public static void main (String[] args){

        Arge arge = new Arge();

        arge.nbYear(1000,2.0, 50, 1200);
        arge.nbYear(1500000, 2.5, 10000, 2000000);
        arge.nbYear(1500000, 0.25, 1000, 2000000);

    }

    // p0 - populacja startowa miasta
    // percent - przyrsot roczny miasta
    // aug - populacja przybywająca co roku
    // p - populacja do osiągnięcia

    public int nbYear(int p0, double percent, int aug, int p) {

        double result = 0.0;
        double temp = p0;
        int counter = 0;

        do {
            counter++;
            result = temp + (int)(temp * percent/100) + aug;
            temp = result;

        } while (result<p);



        return counter;
    }
}
