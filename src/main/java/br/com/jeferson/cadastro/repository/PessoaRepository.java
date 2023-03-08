package br.com.jeferson.cadastro.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.jeferson.cadastro.model.PessoaModel;

@Repository
public interface PessoaRepository extends CrudRepository<PessoaModel, Integer>{

}
