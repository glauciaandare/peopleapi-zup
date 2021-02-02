package br.com.zup.bancozup.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity (name="usuario") 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer codigo;
	
	@Column(nullable = false)
	public String nome;
	
	@Column(nullable = false)
	public String cpf;
	
	@Column(nullable = false)
	public String email;
	
	public String dateNasc;

	
}
