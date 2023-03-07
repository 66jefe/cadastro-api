package br.com.jeferson.cadastro.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaModel {
	
	private Integer id;
	private String nome;
	private int idade;
	private String cpf;
	private String sexo;
	private String telefone;
	
}
