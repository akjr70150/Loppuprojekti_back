package fi.loppuprojekti.back.entiteetit;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Sijainen {

    // GenerationType.IDENTITY????????????????????????????????????????
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sijainenId;
    private String sijainenNimi;
    private String sijainenOsoite;
    private String sijainenPuhelinnumero;
    private String sijainenSahkoposti;

    // Sijainen kytketään toimeksiantoihin
    @OneToMany(mappedBy = "sijainen")
    @JsonIgnore
    List<Toimeksianto> sijaisenToimeksiannot;

    // Konstruktori:
    public Sijainen() {
    }

    // Konstruktori mäppäystä varten, jotta sijaisen saa yhdistettyä toimeksiantoon.
    public Sijainen(int sijainenId) {
        this.sijainenId = sijainenId;
    }

    // Getterit ja setterit:
    public int getSijainenId() {
        return sijainenId;
    }

    public void setSijainenId(int sijainenId) {
        this.sijainenId = sijainenId;
    }

    public String getSijainenNimi() {
        return sijainenNimi;
    }

    public void setSijainenNimi(String sijainenNimi) {
        this.sijainenNimi = sijainenNimi;
    }

    public String getSijainenOsoite() {
        return sijainenOsoite;
    }

    public void setSijainenOsoite(String sijainenOsoite) {
        this.sijainenOsoite = sijainenOsoite;
    }

    public String getSijainenPuhelinnumero() {
        return sijainenPuhelinnumero;
    }

    public void setSijainenPuhelinnumero(String sijainenPuhelinnumero) {
        this.sijainenPuhelinnumero = sijainenPuhelinnumero;
    }

    public String getSijainenSahkoposti() {
        return sijainenSahkoposti;
    }

    public void setSijainenSahkoposti(String sijainenSahkoposti) {
        this.sijainenSahkoposti = sijainenSahkoposti;
    }

    public List<Toimeksianto> getSijaisenToimeksiannot() {
        return sijaisenToimeksiannot;
    }

    public void setSijaisenToimeksiannot(List<Toimeksianto> sijaisenToimeksiannot) {
        this.sijaisenToimeksiannot = sijaisenToimeksiannot;
    }


}
