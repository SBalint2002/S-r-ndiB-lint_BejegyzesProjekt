package hu.petrik.bejegyzesprojektoop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Bejegyzes> bejegyzesek = new ArrayList<>();
    public static void main(String[] args) {
        bejegyzesek = new ArrayList<>();
        kettoa();
    }

    public static void kettoa(){
        bejegyzesek.add(new Bejegyzes("Ágozsga", "VisualStudioban javazni"));
        bejegyzesek.add(new Bejegyzes("ZsomBruh", "Profi programozás kulcsa"));
    }
}
