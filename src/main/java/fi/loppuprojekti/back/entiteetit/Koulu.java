package fi.loppuprojekti.back.entiteetit;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Koulu {

    // GenerationType.IDENTITY????????????????????????????????????????
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int kouluId;

    private String kouluNimi;
    private String kouluOsoite;
    private String kouluYhteyshenkilo;
    private double kouluKoordLat;
    private double kouluKoordLong;

    // Koulu kytketään toimeksiantoihin
    @OneToMany (mappedBy = "koulu")
    @JsonIgnore
    List<Toimeksianto> koulunToimeksiannot;

    // Konstruktori:
    public Koulu() {
    }
    // Konstruktori mäppäystä varten, jotta koulun saa yhdistettyä toimeksiantoon.
    public Koulu(int kouluId) {
        this.kouluId = kouluId;
    }


    // Getterit ja setterit:
    public int getKouluId() {
        return kouluId;
    }

    public void setKouluId(int kouluId) {
        this.kouluId = kouluId;
    }

    public String getKouluNimi() {
        return kouluNimi;
    }

    public void setKouluNimi(String kouluNimi) {
        this.kouluNimi = kouluNimi;
    }

    public String getKouluOsoite() {
        return kouluOsoite;
    }

    public void setKouluOsoite(String kouluOsoite) {
        this.kouluOsoite = kouluOsoite;
    }

    public String getKouluYhteyshenkilo() {
        return kouluYhteyshenkilo;
    }

    public void setKouluYhteyshenkilo(String kouluYhteyshenkilo) {
        this.kouluYhteyshenkilo = kouluYhteyshenkilo;
    }

    public double getKouluKoordLat() {
        return kouluKoordLat;
    }

    public void setKouluKoordLat(double kouluKoordLat) {
        this.kouluKoordLat = kouluKoordLat;
    }

    public double getKouluKoordLong() {
        return kouluKoordLong;
    }

    public void setKouluKoordLong(double kouluKoordLong) {
        this.kouluKoordLong = kouluKoordLong;
    }

    public List<Toimeksianto> getKoulunToimeksiannot() {
        return koulunToimeksiannot;
    }

    public void setKoulunToimeksiannot(List<Toimeksianto> koulunToimeksiannot) {
        this.koulunToimeksiannot = koulunToimeksiannot;
    }


}
