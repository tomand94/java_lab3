import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */

        Osoba osoba1 = new Osoba("Tomek", "Kowalski", 123);
        Student student1 = new Student(osoba1, EnumTest.WydzialEnum.INFORMATYKA);
        Student student2 = new Student(osoba1, EnumTest.WydzialEnum.BUDOWNICTWO);
        Student student3 = new Student(osoba1, EnumTest.WydzialEnum.EKONOMIA);
        Student student4 = new Student(osoba1, EnumTest.WydzialEnum.ELEKTRONIKA);
        Student student5 = new Student(osoba1, EnumTest.WydzialEnum.MECHANIKA);

        List<Student> lista = new ArrayList<>();
        lista.add(student1);
        lista.add(student2);
        lista.add(student3);
        lista.add(student4);
        lista.add(student5);

        for (Student item: lista) {
            System.out.println(item);
        }

    }
}
