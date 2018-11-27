package fi.loppuprojekti.back.entiteetit;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Koulu {

    // Koulu kytketään toimeksiantoihin
    @OneToMany(mappedBy = "koulu")
    @JsonIgnore
    List<Toimeksianto> koulunToimeksiannot;
    // GenerationType.IDENTITY????????????????????????????????????????
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int kouluId;
    private String kouluNimi;
    private String kouluOsoite;
    private String kouluYhteyshenkilo;
    private double kouluKoordLat;
    private double kouluKoordLong;
    private String rehtori;
    private String rehtoriEmail;
    private String rehtoriTel;
    private String sihteeri;
    private String sihteeriEmail;
    private String sihteeriTel;

    // Konstruktori:
    public Koulu() {
    }

    // Konstruktori mäppäystä varten, jotta koulun saa yhdistettyä toimeksiantoon.
    public Koulu(int kouluId) {
        this.kouluId = kouluId;
    }


    // Getterit ja setterit:


    public List<Toimeksianto> getKoulunToimeksiannot() {
        return koulunToimeksiannot;
    }

    public void setKoulunToimeksiannot(List<Toimeksianto> koulunToimeksiannot) {
        this.koulunToimeksiannot = koulunToimeksiannot;
    }

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

    public String getRehtori() {
        return rehtori;
    }

    public void setRehtori(String rehtori) {
        this.rehtori = rehtori;
    }

    public String getRehtoriEmail() {
        return rehtoriEmail;
    }

    public void setRehtoriEmail(String rehtoriEmail) {
        this.rehtoriEmail = rehtoriEmail;
    }

    public String getRehtoriTel() {
        return rehtoriTel;
    }

    public void setRehtoriTel(String rehtoriTel) {
        this.rehtoriTel = rehtoriTel;
    }

    public String getSihteeri() {
        return sihteeri;
    }

    public void setSihteeri(String sihteeri) {
        this.sihteeri = sihteeri;
    }

    public String getSihteeriEmail() {
        return sihteeriEmail;
    }

    public void setSihteeriEmail(String sihteeriEmail) {
        this.sihteeriEmail = sihteeriEmail;
    }

    public String getSihteeriTel() {
        return sihteeriTel;
    }

    public void setSihteeriTel(String sihteeriTel) {
        this.sihteeriTel = sihteeriTel;
    }
}
