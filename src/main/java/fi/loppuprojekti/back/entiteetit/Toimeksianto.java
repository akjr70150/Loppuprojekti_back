package fi.loppuprojekti.back.entiteetit;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Toimeksianto {

    // GenerationType.IDENTITY????????????????????????????????????????
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int toimeksiantoId;

    private Date toimeksiantoAlkuPvm;
    private Date toimeksiantoLoppuPvm;
    private String oppiaine;

    // Koulu yhdistetään toimeksiantoon kouluId:n avulla.
    @ManyToOne
    @JoinColumn(name="kouluId")
    private Koulu koulu;

    // Sijainen yhdistetään toimeksiantoon sijainenId:n avulla.
    @ManyToOne
    @JoinColumn(name="sijainenId")
    private Sijainen sijainen;

    // Konstruktori:
    public Toimeksianto() {
    }

    // Getterit ja setterit:
    public int getToimeksiantoId() {
        return toimeksiantoId;
    }

    public void setToimeksiantoId(int toimeksiantoId) {
        this.toimeksiantoId = toimeksiantoId;
    }

    public Date getToimeksiantoAlkuPvm() {
        return toimeksiantoAlkuPvm;
    }

    public void setToimeksiantoAlkuPvm(Date toimeksiantoAlkuPvm) {
        this.toimeksiantoAlkuPvm = toimeksiantoAlkuPvm;
    }

    public Date getToimeksiantoLoppuPvm() {
        return toimeksiantoLoppuPvm;
    }

    public void setToimeksiantoLoppuPvm(Date toimeksiantoLoppuPvm) {
        this.toimeksiantoLoppuPvm = toimeksiantoLoppuPvm;
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
