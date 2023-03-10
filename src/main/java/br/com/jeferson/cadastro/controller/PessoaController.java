package br.com.jeferson.cadastro.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.jeferson.cadastro.model.PessoaModel;
import br.com.jeferson.cadastro.model.ResponseModel;
import br.com.jeferson.cadastro.service.PessoaService;

@RestController
public class PessoaController {
	
//	Classe onde fica os end-points de microserviços

	@Autowired
	private PessoaService ps;
	
	@GetMapping("/listar/{id}")
	public Optional<PessoaModel> listarId(@PathVariable Integer id) {
		return ps.listarId(id);
	}

	@GetMapping("/listar")
	public Iterable<PessoaModel> listar() {
		return ps.listar();
	}

	@PostMapping("/cadastrar")
	public ResponseEntity<?> cadastrar(@RequestBody PessoaModel pm) {
		return ps.cadastrarAlterar(pm, "cadastrar");
	}

	@PutMapping("/alterar")
	public ResponseEntity<?> alterar(@RequestBody PessoaModel pm) {
		return ps.cadastrarAlterar(pm, "alterar");
	}
	
	@DeleteMapping("/remover/{id}")
	public ResponseEntity<ResponseModel> remover(@PathVariable Integer id) {
		return ps.remover(id);
	}

}
