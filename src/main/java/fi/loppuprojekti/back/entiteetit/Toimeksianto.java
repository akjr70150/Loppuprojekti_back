package fi.loppuprojekti.back.entiteetit;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Toimeksianto {

    // GenerationType.IDENTITY????????????????????????????????????????
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int toimeksiantoId;

    private LocalDateTime ToimeksiantoAlkuaika;
    private LocalDateTime ToimeksiantoLoppuaika;
    private String oppiaine;
    private Boolean vahvistus;


    // Koulu yhdistetään toimeksiantoon kouluId:n avulla.
    @ManyToOne
    @JoinColumn(name = "kouluId")
    private Koulu koulu;

    // Sijainen yhdistetään toimeksiantoon sijainenId:n avulla.
    @ManyToOne
    @JoinColumn(name = "sijainenId")
    private Sijainen sijainen;

    // Konstruktori:
    public Toimeksianto() {

    }

    public Boolean getVahvistus() {
        return vahvistus;
    }

    public void setVahvistus(Boolean vahvistus) {
        this.vahvistus = vahvistus;
    }

    // Getterit ja setterit:
    public int getToimeksiantoId() {
        return toimeksiantoId;
    }

    public void setToimeksiantoId(int toimeksiantoId) {
        this.toimeksiantoId = toimeksiantoId;
    }

    public LocalDateTime getToimeksiantoAlkuaika() {
        return ToimeksiantoAlkuaika;
    }

    public void setToimeksiantoAlkuaika(LocalDateTime toimeksiantoAlkuaika) {
        ToimeksiantoAlkuaika = toimeksiantoAlkuaika;
    }

    public LocalDateTime getToimeksiantoLoppuaika() {
        return ToimeksiantoLoppuaika;
    }

    public void setToimeksiantoLoppuaika(LocalDateTime toimeksiantoLoppuaika) {
        this.ToimeksiantoLoppuaika = toimeksiantoLoppuaika;
    }

    public String getOppiaine() {
        return oppiaine;
    }

    public void setOppiaine(String oppiaine) {
        this.oppiaine = oppiaine;
    }

    public Koulu getKoulu() {
        return koulu;
    }

    public void setKoulu(Koulu koulu) {
        this.koulu = koulu;
    }

    public Sijainen getSijainen() {
        return sijainen;
    }

    public void setSijainen(Sijainen sijainen) {
        this.sijainen = sijainen;
    }
}
