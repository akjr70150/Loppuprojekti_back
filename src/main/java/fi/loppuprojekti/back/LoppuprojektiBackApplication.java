package fi.loppuprojekti.back;

import fi.loppuprojekti.back.entiteetit.Koulu;
import fi.loppuprojekti.back.entiteetit.Sijainen;
import fi.loppuprojekti.back.entiteetit.Toimeksianto;
import fi.loppuprojekti.back.repositoriot.KouluRepository;
import fi.loppuprojekti.back.repositoriot.SijainenRepository;
import fi.loppuprojekti.back.repositoriot.ToimeksiantoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class LoppuprojektiBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoppuprojektiBackApplication.class, args);
    }

    @Bean
    public CommandLineRunner luoKoulu(KouluRepository repo) {
        return args -> {
            Koulu koulu = new Koulu();
            koulu.setKouluNimi("Academy");
            koulu.setKouluOsoite("Keilaniemi 5");
            koulu.setKouluYhteyshenkilo("Maisa");
            koulu.setKouluKoordLat(60.171870);
            koulu.setKouluKoordLong(24.826980);
            repo.save(koulu);
        };
    }

    @Bean
    public CommandLineRunner luoKoulu2(KouluRepository repo) {
        return args -> {
            Koulu koulu2 = new Koulu();
            koulu2.setKouluNimi("Ressun peruskoulu");
            koulu2.setKouluOsoite("Lapinlahdentie 10");
            koulu2.setKouluYhteyshenkilo("Leena Liusvaara");
            koulu2.setKouluKoordLat(60.166950);
            koulu2.setKouluKoordLong(24.927250);
            repo.save(koulu2);
        };
    }

    @Bean
    public CommandLineRunner luoSijainen(SijainenRepository sijaisRepo) {
        return args -> {
            Sijainen sijainen = new Sijainen();
            sijainen.setSijainenNimi("Sami");
            sijainen.setSijainenOsoite("Riihimäen ryövärikuningas aka Tuusulan kauhu aka Rautakansleri aka 'Rauta taipuu, minä en!'");
            sijainen.setSijainenPuhelinnumero("0700123123");
            sijainen.setSijainenSahkoposti("Sami@sami.fi");
            sijaisRepo.save(sijainen);
        };
    }

    @Bean
    public CommandLineRunner luoToimeksianto(ToimeksiantoRepository toimeksiantoRepo) {

        LocalDateTime nyt = LocalDateTime.now();
        LocalDateTime pvmTanaan = LocalDateTime.of(2018, 11, 22, 10, 9);

        return args -> {
            Toimeksianto toimeksianto = new Toimeksianto();
            toimeksianto.setOppiaine("Liikunta");
            toimeksianto.setToimeksiantoAlkuaika(pvmTanaan);
            toimeksianto.setToimeksiantoLoppuaika(pvmTanaan);
            toimeksiantoRepo.save(toimeksianto);
        };
    }

    @Bean
    public CommandLineRunner luoToimeksianto2(ToimeksiantoRepository toimeksiantoRepo) {

        LocalDateTime nyt = LocalDateTime.now();
        LocalDateTime pvmAlku = LocalDateTime.of(2019, 12, 11, 10, 9);
        LocalDateTime pvmLoppu = LocalDateTime.of(2019, 12, 20, 16, 9);

        return args -> {
            Toimeksianto toimeksianto2 = new Toimeksianto();
            toimeksianto2.setOppiaine("Matematiikka");
            toimeksianto2.setToimeksiantoAlkuaika(pvmAlku);
            toimeksianto2.setToimeksiantoLoppuaika(pvmLoppu);
            toimeksiantoRepo.save(toimeksianto2);
        };
    }

    @Bean
    public CommandLineRunner luoToimeksianto3(ToimeksiantoRepository toimeksiantoRepo) {

        LocalDateTime nyt = LocalDateTime.now();
        LocalDateTime pvmAlku = LocalDateTime.of(2018, 12, 1, 9, 0);
        LocalDateTime pvmLoppu = LocalDateTime.of(2018, 12, 2, 16, 0);

        return args -> {
            Toimeksianto toimeksianto3 = new Toimeksianto();
            toimeksianto3.setOppiaine("Biologia");
            toimeksianto3.setToimeksiantoAlkuaika(pvmAlku);
            toimeksianto3.setToimeksiantoLoppuaika(pvmLoppu);
            toimeksiantoRepo.save(toimeksianto3);
        };
    }

}
