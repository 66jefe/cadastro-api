package br.com.jeferson.cadastro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.jeferson.cadastro.model.PessoaModel;
import br.com.jeferson.cadastro.model.ResponseModel;
import br.com.jeferson.cadastro.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pr;
	
	@Autowired
	private ResponseModel rm;
	
	//Método para listar todos os produtos
	public Iterable<PessoaModel> listar() {
		return pr.findAll();
	}
	
	//Método para cadastrar ou alterar pessoas
	public ResponseEntity<?> cadastrarAlterar(PessoaModel pm, String acao) {
		if(pm.getNome().equals("")) {
			rm.setMsg("O nome é obrigatório!");
			return new ResponseEntity<ResponseModel>(rm, HttpStatus.BAD_REQUEST);
		} else if(pm.getCpf().equals("")) {
			rm.setMsg("O CPF é obrigatório!");
			return new ResponseEntity<ResponseModel>(rm, HttpStatus.BAD_REQUEST);
		} else {
			if(acao.equals("cadastrar")) {
				return new ResponseEntity<PessoaModel>(pr.save(pm), HttpStatus.CREATED);
			} else {
				return new ResponseEntity<PessoaModel>(pr.save(pm), HttpStatus.OK);
			}
		}
	}

}
