package br.com.jeferson.cadastro.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity(name="pessoa")
public class PessoaModel implements Serializable {
	
//	Classe modelo onde recebe todos os atributos para cadastrar a pessoa
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idPessoa")
	private Integer id;
	private String nome;
	private int idade;
	
	@Column(length = 11)
	private String cpf;
	
	@Column(length = 9)
	private String sexo;
	
	@Column(length = 11)
	private String telefone;
	
}
