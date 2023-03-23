package com.generation.helloworld.controller;

import java.util.List;
import java.util.ArrayList;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.helloworld.model.BSM;
import com.generation.helloworld.model.ObjetivosPessoais;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}

	@GetMapping("/lista-bsm")
	public List<BSM> listaBSM() {
		BSM orientacaoAoFuturo = new BSM("Orientação ao Futuro");
		BSM orientacaoaosdetalhes = new BSM("Orientação aos Detalhes");
		BSM persistencia = new BSM("Persistência");
		BSM comunicacao = new BSM("Comunicação");
		BSM trabalhoEmEquipe = new BSM("Trabalho em Equipe");
		BSM responsabilidadePessoal = new BSM("Responsabilidade Pessoal");
		BSM proatividade = new BSM("Proatividade");
		BSM mentalidadeDeCrescimento = new BSM("Mentalidade de Crescimento");

		List<BSM> listaBSM = new ArrayList<>();
		listaBSM.add(orientacaoAoFuturo);
		listaBSM.add(orientacaoaosdetalhes);
		listaBSM.add(persistencia);
		listaBSM.add(comunicacao);
		listaBSM.add(trabalhoEmEquipe);
		listaBSM.add(responsabilidadePessoal);
		listaBSM.add(proatividade);
		listaBSM.add(mentalidadeDeCrescimento);
		

		return listaBSM;
	}

	@GetMapping("/lista-objetivos-pessoais")
	public List<ObjetivosPessoais> listaObjetivosPessoais() {
		ObjetivosPessoais ob1 = new ObjetivosPessoais("Dominar melhor a Linguagem Java e Spring");
		ObjetivosPessoais ob2 = new ObjetivosPessoais("Aprender a Criar UI igual de grandes empresas");
		ObjetivosPessoais ob3 = new ObjetivosPessoais("Ser mais persistente, O trabalho duro vence o dom natural");

		List<ObjetivosPessoais> objetivos = new ArrayList<>();
		objetivos.add(ob1);
		objetivos.add(ob2);
		objetivos.add(ob3);
		return objetivos;
	}

}
