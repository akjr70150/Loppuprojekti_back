package fi.loppuprojekti.back.kontrollerit;

import fi.loppuprojekti.back.repositoriot.KouluRepository;
import fi.loppuprojekti.back.entiteetit.Koulu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class KouluController {

    private KouluRepository kouluRepo;

    @Autowired
    public KouluController(KouluRepository kouluRepo) {
        this.kouluRepo = kouluRepo;
    }

    @GetMapping("/api/koulu")
    public Iterable<Koulu> haeKaikkiKoulut() {
        return kouluRepo.findAll();
    }

    @GetMapping("/api/koulu/{id}")
    public ResponseEntity<?> haeKoulu(@PathVariable(name = "id") int id) {
        Optional<Koulu> optionalKoulu = kouluRepo.findAllByKouluId(id);
        if(optionalKoulu.isPresent()) {
            return ResponseEntity.ok(optionalKoulu.get());
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/api/koulu/{id}")
    @Transactional
    public ResponseEntity<?> poistaKoulu(@PathVariable(name = "id") int id) {
        Optional<Koulu> optionalKoulu = kouluRepo.findAllByKouluId(id);

        if(optionalKoulu.isPresent()) {
            return ResponseEntity.ok(kouluRepo.removeKouluByKouluId(id));
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/api/koulu/")
    public Koulu uusiKoulu(@Valid @RequestBody Koulu kouluolio) {
        return kouluRepo.save(kouluolio);

    } // TÄHÄN VOI LISÄTÄ VIRHEKÄSITTELYN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    @PutMapping("api/koulu/{id}")
    public Koulu muutaKoulu(@PathVariable(name="id") int id, @Valid @RequestBody Koulu kouluolio) throws Exception {

        return kouluRepo.findAllByKouluId(id)
                .map(koulu -> {
                    koulu.setKouluNimi(kouluolio.getKouluNimi());
                    koulu.setKouluOsoite(kouluolio.getKouluOsoite());
                    koulu.setKouluYhteyshenkilo(kouluolio.getKouluYhteyshenkilo());
                    return kouluRepo.save(kouluolio);
                }).orElseThrow(() -> new Exception("Koulua ID:llä " + id + " ei löytynyt."));

    }

}
