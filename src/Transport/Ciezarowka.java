package Transport;

import Towar.Kontener;
import Towar.Magazyn;
import Towar.Transport;

public class Ciezarowka extends Transport {
    final private static int POJEMNOSC = 1;

    @Override
    public void przetransportoj(Magazyn z, Magazyn dokat, int iloscKontenerow) {
        if (iloscKontenerow > POJEMNOSC){
            System.out.println("Za mała pojemnosc, operacja nie udana");
            return;
        }
        super.przetransportoj(z, dokat, iloscKontenerow);
        System.out.println("Transport poprzez ciężarówką");
        // 1 załaduj kontenery
        for (int i=0; i<iloscKontenerow; i++){
            Kontener kontener = z.wezKontener();
            zaladuj(kontener);
        }

        // 2 rozładuj kontenery
        for (Kontener k: kontenery) {
            dokat.dodajKontener(k);
        }
        kontenery.clear();
    }

    @Override
    public void zaladuj(Kontener kontener){
        if (kontenery.size() == POJEMNOSC)
            return;
        kontenery.add(kontener);
    }
}
