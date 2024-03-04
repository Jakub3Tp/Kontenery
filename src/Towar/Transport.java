package Towar;

import java.util.ArrayList;

public abstract class Transport {
    protected ArrayList<Kontener> kontenery = new ArrayList<>();
    public void przetransportoj(Magazyn z, Magazyn dokat, int iloscKontenerow){
        System.out.printf("Transportuje kontenery z %s do %s \n", z.getMiejscowosc(), dokat.getMiejscowosc());

    }
    public abstract void zaladuj(Kontener kontener);
}
