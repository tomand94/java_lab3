import java.util.Locale;

public class Student {
            /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

    private Osoba osoba;
    private EnumTest.WydzialEnum wydzial;

    public Student(Osoba osoba, EnumTest.WydzialEnum wydzial) {
        this.osoba = osoba;
        this.wydzial = wydzial;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    public EnumTest.WydzialEnum getWydzial() {
        return wydzial;
    }

    public void setWydzial(EnumTest.WydzialEnum wydzial) {
        this.wydzial = wydzial;
    }

    @Override
    public String toString() {
        String info = "Imie: " + osoba.getImie() + ", nazwisko: " + osoba.getNazwisko() + ", indeks: "
                + osoba.getIndeks() + ", wydzial: " + getWydzial().toString().toLowerCase();
        return info;
    }
}

