package repository;

import org.springframework.data.repository.CrudRepository;

import domain.Estudante;

public interface EstudanteRepository extends CrudRepository<Estudante, String> {

}
