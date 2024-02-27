package Towar;

import java.util.ArrayList;

public abstract class Transport {
    private ArrayList<Kontener> kontenery = new ArrayList<>();
    public void prztransportoj(Magazyn z, Magazyn dokat){

    }
    public abstract void zaladoj(Kontener kontener);
}
