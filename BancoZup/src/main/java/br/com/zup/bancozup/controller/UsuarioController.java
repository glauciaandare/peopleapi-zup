package br.com.zup.bancozup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.bancozup.model.UsuarioModel;
import br.com.zup.bancozup.repository.UsuarioRepository;


@RestController
public class UsuarioController {
		
	@Autowired
	public UsuarioRepository repository;
	
	
	@SuppressWarnings("rawtypes")
	@GetMapping(path = "api/usuario/{codigo}") //Para ter acesso ao bd.
	public ResponseEntity consultar(@PathVariable("codigo") Integer codigo) {
		 
		 return repository.findById(codigo).map(record -> ResponseEntity.ok().body(record))
				 .orElse(ResponseEntity.notFound().build());
	 }
	 
	 @PostMapping(path = "api/usuario/salvar")
	 public UsuarioModel salvar (@RequestBody UsuarioModel usuario) {
		 return repository.save(usuario);
	 }
}
