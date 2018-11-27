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
            koulu.setKouluOsoite("Keilaniemi");
            koulu.setKouluYhteyshenkilo("Nooa");
            koulu.setRehtori("Riku Rehtori");
            koulu.setRehtoriEmail("riku.rehtori@koulu.org");
            koulu.setRehtoriTel("0800123123");
            koulu.setSihteeri("Irma Sihti");
            koulu.setSihteeriEmail("irman@email.com");
            koulu.setSihteeriTel("0800321321");
            repo.save(koulu);
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

}
