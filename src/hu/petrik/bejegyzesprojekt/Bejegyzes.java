package hu.petrik.bejegyzesprojekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Bejegyzes {
    private List<Bejegyzes> bejegyzesek = new ArrayList<>(2);
    private String szerzo;
    private String tartalom;
    private  int likeok;
    private LocalDateTime letrejott;
    private  LocalDateTime szerkesztve;

    public Bejegyzes(String szerzo,String tartalom) {
        this.szerzo = szerzo;
        this.tartalom = tartalom;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public String getTartalom() {
        return tartalom;
    }

    public int getLikeok() {
        return likeok;
    }

    public LocalDateTime getLetrejott() {
        return letrejott;
    }

    public LocalDateTime getSzerkesztve() {
        return szerkesztve;
    }

    public void like() {
        likeok++;
    }

    @Override
    public String toString() {
        return String.format("s-s-s" + this.szerzo, this.likeok,this.letrejott
        + "/" + this.szerkesztve +"/" + this.tartalom);

    }

    public void Bekeres() {
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


