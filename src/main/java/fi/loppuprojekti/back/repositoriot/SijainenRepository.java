package fi.loppuprojekti.back.repositoriot;

import fi.loppuprojekti.back.entiteetit.Sijainen;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface SijainenRepository extends CrudRepository<Sijainen, String> {

    Optional<Sijainen> findAllBySijainenId(Integer id);
    Optional<Sijainen> removeSijainenBySijainenId(Integer id);
    Optional<Sijainen> findAllBySijainenSahkoposti (String email);

}
