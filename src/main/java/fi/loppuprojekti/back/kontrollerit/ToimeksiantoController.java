package fi.loppuprojekti.back.kontrollerit;

import fi.loppuprojekti.back.entiteetit.Toimeksianto;
import fi.loppuprojekti.back.repositoriot.ToimeksiantoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class ToimeksiantoController {

    private ToimeksiantoRepository toimeksiantoRepo;

    @Autowired
    public ToimeksiantoController(ToimeksiantoRepository toimeksiantoRepo) {
        this.toimeksiantoRepo = toimeksiantoRepo;
    }

    @GetMapping("/api/toimeksianto")
    public Iterable<Toimeksianto> haeKaikkiToimeksiannot() {
        return toimeksiantoRepo.findAll();
    }

    @GetMapping("/api/toimeksianto/{id}")
    public ResponseEntity<?> haeToimeksianto(@PathVariable(name = "id") int id) {
        Optional<Toimeksianto> optionalToimeksianto = toimeksiantoRepo.findAllByToimeksiantoId(id);
        if(optionalToimeksianto.isPresent()) {
            return ResponseEntity.ok(optionalToimeksianto.get());
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/api/toimeksianto/{id}")
    @Transactional
    public ResponseEntity<?> poistaToimeksianto(@PathVariable(name = "id") int id) {
        Optional<Toimeksianto> optionalToimeksianto = toimeksiantoRepo.findAllByToimeksiantoId(id);

        if(optionalToimeksianto.isPresent()) {
            return ResponseEntity.ok(toimeksiantoRepo.removeKouluByToimeksiantoId(id));
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/api/toimeksianto/")
    public Toimeksianto uusiToimeksianto(@Valid @RequestBody Toimeksianto toimeksiantoolio) {
        return toimeksiantoRepo.save(toimeksiantoolio);

    } // TÄHÄN VOI LISÄTÄ VIRHEKÄSITTELYN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    @PutMapping("api/toimeksianto/{id}")
    public Toimeksianto muutaToimeksianto(@PathVariable(name="id") int id, @Valid @RequestBody Toimeksianto toimeksiantoolio) throws Exception {

        return toimeksiantoRepo.findAllByToimeksiantoId(id)
                .map(toimeksianto -> {
                    toimeksianto.setOppiaine(toimeksiantoolio.getOppiaine());
                    toimeksianto.setToimeksiantoAlkuaika(toimeksiantoolio.getToimeksiantoAlkuaika());
                    toimeksianto.setToimeksiantoLoppuaika(toimeksiantoolio.getToimeksiantoLoppuaika());
                    toimeksianto.setKoulu(toimeksiantoolio.getKoulu());
                    toimeksianto.setSijainen(toimeksiantoolio.getSijainen());
                    return toimeksiantoRepo.save(toimeksiantoolio);
                }).orElseThrow(() -> new Exception("Toimeksiantoa ID:llä " + id + " ei löytynyt."));

    }

}
