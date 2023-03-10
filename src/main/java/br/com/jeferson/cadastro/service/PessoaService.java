package br.com.jeferson.cadastro.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.jeferson.cadastro.model.PessoaModel;
import br.com.jeferson.cadastro.model.ResponseModel;
import br.com.jeferson.cadastro.repository.PessoaRepository;

@Service
public class PessoaService {
	
//	Classe onde fica todos os métodos get, post, put e delete
	
	@Autowired
	private PessoaRepository pr;
	
	@Autowired
	private ResponseModel rm;
	
//	Método para listar todas pessoas
	public Iterable<PessoaModel> listar() {
		return pr.findAll();
	}
	
//	Método para listar pessoa por id	
	public Optional<PessoaModel> listarId(Integer id) {
		return pr.findById(id);
	}
	
//	Método para cadastrar ou alterar pessoas
	public ResponseEntity<?> cadastrarAlterar(PessoaModel pm, String acao) {
		if(pm.getNome().equals("")) {
			rm.setMsg("O nome é obrigatório!");
			return new ResponseEntity<ResponseModel>(rm, HttpStatus.BAD_REQUEST);
		} else if(pm.getCpf().equals("")) {
			rm.setMsg("O CPF é obrigatório!");
			return new ResponseEntity<ResponseModel>(rm, HttpStatus.BAD_REQUEST);
		} else if(pm.getIdade().equals("")) {
			rm.setMsg("A idade é obrigatório!");
			return new ResponseEntity<ResponseModel>(rm, HttpStatus.BAD_REQUEST);
		} else {
			if(acao.equals("cadastrar")) {
				return new ResponseEntity<PessoaModel>(pr.save(pm), HttpStatus.CREATED);
			} else {
				return new ResponseEntity<PessoaModel>(pr.save(pm), HttpStatus.OK);
			}
		}
	}
	
//	Método para deletar pessoa
	public ResponseEntity<ResponseModel> remover(Integer id) {
		pr.deleteById(id);
		rm.setMsg("O cadastro de pessoa foi removido com sucesso!");
		return new ResponseEntity<ResponseModel>(rm, HttpStatus.OK);
	}

}
