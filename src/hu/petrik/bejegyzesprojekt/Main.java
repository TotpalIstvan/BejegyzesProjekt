package hu.petrik.bejegyzesprojekt;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        int likeok = 0;
        LocalDateTime szerkesztve = LocalDateTime.now();
        LocalDateTime letrehozas = LocalDateTime.now();


        Scanner sc = new Scanner(System.in);

        System.out.println("Kérek egy darabszámot!");
        int db = sc.nextInt();
        System.out.println("Kérem a bejegyzések számát!");
        int bejegyzesekSzama = sc.nextInt();

        if (db != bejegyzesekSzama) {
            db = bejegyzesekSzama;
        }

    }
}
