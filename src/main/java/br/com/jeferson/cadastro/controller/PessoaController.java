package br.com.jeferson.cadastro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.jeferson.cadastro.model.PessoaModel;
import br.com.jeferson.cadastro.service.PessoaService;

@RestController
@CrossOrigin(origins = "*")
public class PessoaController {
	
	@Autowired
	private PessoaService ps;
	
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
	
}
