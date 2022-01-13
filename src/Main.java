import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */

        Notebook notebook1 = new Notebook(40, 8192, 4500);
        notebook1.coolDown();
        Notebook notebook2 = new Notebook(30, 8192, 5500);
        Notebook notebook3 = new Notebook(60, 8192, 4500);
        Notebook notebook4 = new Notebook(55, 8192, 7500);
        Notebook notebook5 = new Notebook(40, 8192, 4300);


        List<Notebook> lista = new ArrayList<>();
        lista.add(notebook1);
        lista.add(notebook2);
        lista.add(notebook3);
        lista.add(notebook4);
        lista.add(notebook5);

        for (Notebook item: lista) {
            System.out.println(item);
        }


    }
}
