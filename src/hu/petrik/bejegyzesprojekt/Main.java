package hu.petrik.bejegyzesprojekt;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        List<Bejegyzes> bejegyzes = new ArrayList<>(2);

        Scanner sc = new Scanner(System.in);

        System.out.println("Kérek egy darabszámot!");
        int db = sc.nextInt();
        System.out.println("Kérem a bejegyzések számát!");
        int bejegyzesekSzama = sc.nextInt();

        if (db != bejegyzesekSzama) {
            System.out.println("A két számnak ugyanannyinak kell lennie");
        }
    }
}
