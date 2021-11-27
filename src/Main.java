import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 1 enum-y */

        /* zad.1
        a) Stworzyć prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi słownie,
        b) stworzyć prosty enum "StatusEnum" z wartościami KONTYNUUJEMY i KONIEC,
        c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla),
        d) niech w pętli są podawane wartości liczbowe z klawiatury,
        e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie,
        f) umieścić w pętli switch() case: które będą wypisywały cyfry słownie odpowiednio
        do podanych cyfr przez użytkownika,
        g) gdy użytkownik wciśnie 0 ma wyświetlić się status KONIEC w innym wypadku KONTYNUUJEMY :),
        */

        /* statusy i wybór ze switch case to najczęstsze użycia enumów, enumy są często używane
        * w różnego rodzaju listach, selectach jako krótkie opcje wyboru np. jako status A, X (Aktualny, Usunięty) */
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println(LiczbyEnum.JEDEN);

        while (true) {
            System.out.println("Podaj liczbę od 1 do 6 (0 konczy petle)");
            input = sc.nextInt();
            if (input == 0) {
                System.out.println(StatusEnum.KONIEC.toString());
                break;
            } else {
                System.out.println(StatusEnum.KONTYNUUJEMY.toString());
            }
            switch (input) {
                case 1:
                    System.out.println(LiczbyEnum.JEDEN.toString().toLowerCase());
                    continue;
                case 2:
                    System.out.println(LiczbyEnum.DWA.toString().toLowerCase());
                    continue;
                case 3:
                    System.out.println(LiczbyEnum.TRZY.toString().toLowerCase());
                    continue;
                case 4:
                    System.out.println(LiczbyEnum.CZTERY.toString().toLowerCase());
                    continue;
                case 5:
                    System.out.println(LiczbyEnum.PIEC.toString().toLowerCase());
                    continue;
                case 6:
                    System.out.println(LiczbyEnum.SZESC.toString().toLowerCase());
            }

        }
    }
}

enum LiczbyEnum {
    JEDEN, DWA, TRZY, CZTERY, PIEC, SZESC;
}

enum StatusEnum {
    KONTYNUUJEMY, KONIEC;
}