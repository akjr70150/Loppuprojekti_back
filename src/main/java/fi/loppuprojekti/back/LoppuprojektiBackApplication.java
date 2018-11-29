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
            koulu.setRehtori("Riku Rehtori");
            koulu.setRehtoriEmail("riku.rehtori@koulu.org");
            koulu.setRehtoriTel("0800123123");
            koulu.setSihteeri("Irma Sihti");
            koulu.setSihteeriEmail("irman@email.com");
            koulu.setSihteeriTel("0800321321");
            repo.save(koulu);
            Koulu koulu1 = new Koulu();
            koulu1.setKouluNimi("Kauniaisten Lukio");
            koulu1.setKouluOsoite("Kasavuorentie 1");
            koulu1.setKouluYhteyshenkilo("Matti");
            koulu1.setKouluKoordLat(60.215197);
            koulu1.setKouluKoordLong(24.704153);
            koulu1.setRehtori("Riku Rehtori");
            koulu1.setRehtoriEmail("riku.rehtori@koulu.org");
            koulu1.setRehtoriTel("0800123123");
            koulu1.setSihteeri("Irma Sihti");
            koulu1.setSihteeriEmail("irman@email.com");
            koulu1.setSihteeriTel("0800321321");
            repo.save(koulu1);
            Koulu koulu2 = new Koulu();
            koulu2.setKouluNimi("Helsingin Rudolf Steiner -koulu");
            koulu2.setKouluOsoite("Helsinki");
            koulu2.setKouluYhteyshenkilo("Teppo");
            koulu2.setKouluKoordLat(60.201441);
            koulu2.setKouluKoordLong(24.908629);
            koulu2.setRehtori("Riku Rehtori");
            koulu2.setRehtoriEmail("riku.rehtori@koulu.org");
            koulu2.setRehtoriTel("0800123123");
            koulu2.setSihteeri("Irma Sihti");
            koulu2.setSihteeriEmail("irman@email.com");
            koulu2.setSihteeriTel("0800321321");
            repo.save(koulu2);
            Koulu koulu3 = new Koulu();
            koulu3.setKouluNimi("Helsingin Saksalainen Koulu");
            koulu3.setKouluOsoite("Helsinki");
            koulu3.setKouluYhteyshenkilo("Mirja");
            koulu3.setKouluKoordLat(60.167357);
            koulu3.setKouluKoordLong(24.931953);
            koulu3.setRehtori("Riku Rehtori");
            koulu3.setRehtoriEmail("riku.rehtori@koulu.org");
            koulu3.setRehtoriTel("0800123123");
            koulu3.setSihteeri("Irma Sihti");
            koulu3.setSihteeriEmail("irman@email.com");
            koulu3.setSihteeriTel("0800321321");
            repo.save(koulu3);
            Koulu koulu4 = new Koulu();
            koulu4.setKouluNimi("Töölön ala-aste");
            koulu4.setKouluOsoite("Töölö");
            koulu4.setKouluYhteyshenkilo("Pirjo");
            koulu4.setKouluKoordLat(60.182733);
            koulu4.setKouluKoordLong(24.922112);
            koulu4.setRehtori("Riku Rehtori");
            koulu4.setRehtoriEmail("riku.rehtori@koulu.org");
            koulu4.setRehtoriTel("0800123123");
            koulu4.setSihteeri("Irma Sihti");
            koulu4.setSihteeriEmail("irman@email.com");
            koulu4.setSihteeriTel("0800321321");
            repo.save(koulu4);
            Koulu koulu5 = new Koulu();
            koulu5.setKouluNimi("Taivallahden Koulu");
            koulu5.setKouluOsoite("Helsinki");
            koulu5.setKouluYhteyshenkilo("Mirjami");
            koulu5.setKouluKoordLat(60.176776);
            koulu5.setKouluKoordLong(24.916966);
            koulu5.setRehtori("Riku Rehtori");
            koulu5.setRehtoriEmail("riku.rehtori@koulu.org");
            koulu5.setRehtoriTel("0800123123");
            koulu5.setSihteeri("Irma Sihti");
            koulu5.setSihteeriEmail("irman@email.com");
            koulu5.setSihteeriTel("0800321321");
            repo.save(koulu5);
            Koulu koulu6 = new Koulu();
            koulu6.setKouluNimi("Käpylän Koulu");
            koulu6.setKouluOsoite("Helsinki");
            koulu6.setKouluYhteyshenkilo("Jooseppi");
            koulu6.setKouluKoordLat(60.216615);
            koulu6.setKouluKoordLong(24.947332);
            koulu6.setRehtori("Riku Rehtori");
            koulu6.setRehtoriEmail("riku.rehtori@koulu.org");
            koulu6.setRehtoriTel("0800123123");
            koulu6.setSihteeri("Irma Sihti");
            koulu6.setSihteeriEmail("irman@email.com");
            koulu6.setSihteeriTel("0800321321");
            repo.save(koulu6);
            Koulu koulu7 = new Koulu();
            koulu7.setKouluNimi("Leppävaaran Lukio");
            koulu7.setKouluOsoite("Lepuski");
            koulu7.setKouluYhteyshenkilo("Abdirahman");
            koulu7.setKouluKoordLat(60.226017);
            koulu7.setKouluKoordLong(24.805696);
            koulu7.setRehtori("Riku Rehtori");
            koulu7.setRehtoriEmail("riku.rehtori@koulu.org");
            koulu7.setRehtoriTel("0800123123");
            koulu7.setSihteeri("Irma Sihti");
            koulu7.setSihteeriEmail("irman@email.com");
            koulu7.setSihteeriTel("0800321321");
            repo.save(koulu7);
            Koulu koulu8 = new Koulu();
            koulu8.setKouluNimi("Neulamäen Koulu");
            koulu8.setKouluOsoite("Nepali");
            koulu8.setKouluYhteyshenkilo("Matti Kuronen");
            koulu8.setKouluKoordLat(62.883092);
            koulu8.setKouluKoordLong(27.610053);
            koulu8.setRehtori("Veli-Pekka Tikka");
            koulu8.setRehtoriEmail("vp@nepali.com");
            koulu8.setRehtoriTel("0800123123");
            koulu8.setSihteeri("Leena Katainen");
            koulu8.setSihteeriEmail("leena@nepali.com");
            koulu8.setSihteeriTel("0800321321");
            repo.save(koulu8);
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
            koulu2.setRehtori("Leena Liusvaara");
            koulu2.setRehtoriEmail("leena@helsinki.fi");
            koulu2.setRehtoriTel("0800123123");
            koulu2.setSihteeri("Timo Terävä");
            koulu2.setSihteeriEmail("timonposti@email.com");
            koulu2.setSihteeriTel("0800321321");
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
            toimeksianto.setVahvistus(false);
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
            toimeksianto2.setVahvistus(false);
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
            toimeksianto3.setVahvistus(false);

            toimeksiantoRepo.save(toimeksianto3);
        };
    }

}
