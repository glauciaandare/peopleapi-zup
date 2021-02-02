package br.com.zup.bancozup.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.zup.bancozup.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {

}
