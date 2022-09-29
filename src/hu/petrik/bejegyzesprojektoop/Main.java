package hu.petrik.bejegyzesprojektoop;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.*;

public class Main {
    public static List<Bejegyzes> bejegyzesek = new ArrayList<>();
    public static void main(String[] args) {
        bejegyzesek = new ArrayList<>();
        kettoa();
        kettob();
    }

    public static void kettoa(){
        bejegyzesek.add(new Bejegyzes("Ágozsga", "VisualStudioban javazni"));
        bejegyzesek.add(new Bejegyzes("ZsomBruh", "Profi programozás kulcsa"));
    }

    public static void kettob(){
        Scanner sc = new Scanner(in);
        out.print("Hány új elemet szeretne hozzáadni a listához?\nVálasz: ");
        try{
            int darabszam = sc.nextInt();
            for (int i = 0; i < darabszam; i++) {
                out.print("Szerző neve: ");
                String szerzo = sc.next();
                out.print("Tartalom: ");
                String tartalom = sc.next();
                bejegyzesek.add(new Bejegyzes(szerzo,tartalom));
            }
        }catch (InputMismatchException e){
            out.println("Hiba! Nem egész számot adott meg!");
        }
    }
}
