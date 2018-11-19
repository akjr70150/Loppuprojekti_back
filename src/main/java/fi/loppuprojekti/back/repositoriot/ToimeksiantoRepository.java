package fi.loppuprojekti.back.repositoriot;

import fi.loppuprojekti.back.entiteetit.Toimeksianto;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ToimeksiantoRepository extends CrudRepository<Toimeksianto, String> {

    Optional<Toimeksianto> findAllByToimeksiantoId(Integer id);
    Optional<Toimeksianto> removeKouluByToimeksiantoId(Integer id);

}
