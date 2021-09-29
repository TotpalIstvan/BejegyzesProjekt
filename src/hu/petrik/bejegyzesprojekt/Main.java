package hu.petrik.bejegyzesprojekt;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    private List<Bejegyzes> bejegyzesek = new ArrayList<>(2);
    public void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Kérek egy darabszámot!");
        int db = sc.nextInt();
        System.out.println("Kérem a bejegyzések számát!");
        int bejegyzesekSzama = sc.nextInt();

        if (db != bejegyzesekSzama) {
            db = bejegyzesekSzama;
        }

try {

    FileReader fr = new FileReader("bejegyzesek.txt");
    BufferedReader br = new BufferedReader(fr);
    String sor = br.readLine();
    while (sor != null) {
        String[] adatok = sor.split(";");
        Bejegyzes bejegyzes = new Bejegyzes(adatok[0],adatok[1]);
        this.bejegyzesek.add(bejegyzes);
        sor = br.readLine();
    }
}catch (IOException e) {
    System.out.println(e.getMessage());
}
    }
}
