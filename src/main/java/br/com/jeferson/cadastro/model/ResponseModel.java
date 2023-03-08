package br.com.jeferson.cadastro.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class ResponseModel {
	
//	Classe para mensagens personalisadas em caso de erros
	
	private String msg;

}
