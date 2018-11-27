package fi.loppuprojekti.back.kontrollerit;

import fi.loppuprojekti.back.entiteetit.Sijainen;
import fi.loppuprojekti.back.repositoriot.SijainenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class SijainenController {

    private SijainenRepository sijainenRepo;

    @Autowired
    public SijainenController(SijainenRepository sijainenRepo) {
        this.sijainenRepo = sijainenRepo;
    }

    @GetMapping("/api/sijainen")
    public Iterable<Sijainen> haeKaikkiSijaiset() {
        return sijainenRepo.findAll();
    }

    @GetMapping("/api/sijainen/{id}")
    public ResponseEntity<?> haeSijainen(@PathVariable(name = "id") int id) {
        Optional<Sijainen> optionalSijainen = sijainenRepo.findAllBySijainenId(id);
        if(optionalSijainen.isPresent()) {
            return ResponseEntity.ok(optionalSijainen.get());
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/api/sijainenemail/{email}")
    public ResponseEntity<?> haeSijainenEmaililla(@PathVariable(name = "email") String email) {
        Optional<Sijainen> optionalSijainen = sijainenRepo.findAllBySijainenSahkoposti(email);
        if(optionalSijainen.isPresent()) {
            return ResponseEntity.ok(optionalSijainen.get());
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/api/sijainen/{id}")
    @Transactional
    public ResponseEntity<?> poistaSijainen(@PathVariable(name = "id") int id) {
        Optional<Sijainen> optionalSijainen = sijainenRepo.findAllBySijainenId(id);

        if(optionalSijainen.isPresent()) {
            return ResponseEntity.ok(sijainenRepo.removeSijainenBySijainenId(id));
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/api/sijainen/")
    public Sijainen uusiSijainen(@Valid @RequestBody Sijainen sijainenolio) {
        return sijainenRepo.save(sijainenolio);

    } // TÄHÄN VOI LISÄTÄ VIRHEKÄSITTELYN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    @PutMapping("api/sijainen/{id}")
    public Sijainen muutaSijainen(@PathVariable(name="id") int id, @Valid @RequestBody Sijainen sijainenolio) throws Exception {

        return sijainenRepo.findAllBySijainenId(id)
                .map(koulu -> {
                    koulu.setSijainenNimi(sijainenolio.getSijainenNimi());
                    koulu.setSijainenOsoite(sijainenolio.getSijainenOsoite());
                    koulu.setSijainenPuhelinnumero(sijainenolio.getSijainenPuhelinnumero());
                    koulu.setSijainenSahkoposti(sijainenolio.getSijainenSahkoposti());
                    return sijainenRepo.save(sijainenolio);
                }).orElseThrow(() -> new Exception("Sijaisen ID:llä " + id + " ei löytynyt tietoja."));

    }

}
