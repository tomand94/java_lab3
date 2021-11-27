import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */

        List<Student> studenci = new ArrayList<>();

        Student stud1 = new Student();
        stud1.imie = "Adam";
        stud1.nazwisko = "Kowalski";
        stud1.wiek = 23;
        stud1.pelnoletni = true;

        Student stud2 = new Student();
        stud2.imie = "Magda";
        stud2.nazwisko = "Nowak";
        stud2.wiek = 17;
        stud2.pelnoletni = false;

        Student stud3 = new Student();
        stud3.imie = "Janusz";
        stud3.nazwisko = "Tracz";
        stud3.wiek = 66;
        stud3.pelnoletni = true;

        studenci.add(stud1);
        studenci.add(stud2);
        studenci.add(stud3);

        for (Student item: studenci) {
            System.out.println("Imię: " + item.imie);
            System.out.println("Nazwisko: " + item.nazwisko);
            System.out.println("Wiek: " + item.wiek);
            if (item.pelnoletni = true) {
            System.out.println("Pelnoletni: tak\n");
            }   else {
                System.out.println("Pelnoletni: nie\n");
            }
        }
    }
}

