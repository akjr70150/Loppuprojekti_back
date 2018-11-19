package fi.loppuprojekti.back.repositoriot;

import fi.loppuprojekti.back.entiteetit.Koulu;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface KouluRepository extends CrudRepository<Koulu, String> {

    Optional<Koulu> findAllByKouluId(Integer id);
    Optional<Koulu> removeKouluByKouluId(Integer id);

}
