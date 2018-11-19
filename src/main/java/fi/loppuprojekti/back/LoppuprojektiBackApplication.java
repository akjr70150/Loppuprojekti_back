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

import java.time.LocalDate;
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
            koulu.setKouluOsoite("Keilaniemi");
            koulu.setKouluYhteyshenkilo("Nooa");
            repo.save(koulu);
        };
    }

    @Bean
    public CommandLineRunner luoSijainen(SijainenRepository sijaisRepo) {
        return args -> {
            Sijainen sijainen = new Sijainen();
            sijainen.setSijainenNimi("Sami");
            sijainen.setSijainenOsoite("Rixu");
            sijainen.setSijainenPuhelinnumero("0700123123");
            sijainen.setSijainenSahkoposti("Sami@sami.fi");
            sijaisRepo.save(sijainen);
        };
    }

    @Bean
    public CommandLineRunner luoToimeksianto(ToimeksiantoRepository toimeksiantoRepo) {

        LocalDateTime nyt = LocalDateTime.now();
        java.sql.Date pvmTanaan = java.sql.Date.valueOf("2000-11-11");

        return args -> {
            Toimeksianto toimeksianto = new Toimeksianto();
            toimeksianto.setOppiaine("Liikunta");
            toimeksianto.setToimeksiantoAlkuPvm(pvmTanaan);
            toimeksianto.setToimeksiantoLoppuPvm(pvmTanaan);
            toimeksiantoRepo.save(toimeksianto);
        };
    }

}
