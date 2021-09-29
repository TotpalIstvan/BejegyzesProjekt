package hu.petrik.bejegyzesprojekt;

import java.time.LocalDateTime;

public class Bejegyzes {
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
}
