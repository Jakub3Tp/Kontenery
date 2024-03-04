import Towar.Kontener;
import Towar.Magazyn;
import Towar.Towar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Tworze magazyny
        ArrayList<Magazyn> magazyny = new ArrayList<>();
        Magazyn Hamburg = new Magazyn("Hamburg");
        Magazyn Tokio = (new Magazyn("Tokio"));
        Magazyn Wroclaw = (new Magazyn("Wrocław"));

        // 100 Kontenerów
        for (int i = 0; i<100; i++){
            Tokio.dodajKontener(new Kontener(Towar.Konsole));
        }

        for (int i = 0; i<50; i++){
            Tokio.dodajKontener(new Kontener(Towar.Banany));
        }

        for (int i = 0; i<40; i++){
            Tokio.dodajKontener(new Kontener(Towar.Meble));
        }
    }
}