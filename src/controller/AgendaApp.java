package controller;

import java.util.Date;
import model.Pessoa;


public class AgendaApp {

	public static void main(String[] args) 
	{
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Maria");
		pessoa.setSobrenome("Sobre");
		pessoa.setTelefone("123456789");
		pessoa.setCelular("987654321");
		pessoa.setAniversario(new Date());
		pessoa.setIdade(40);
		
		System.out.println("nome: " +pessoa.getNome());
		System.out.println("sobrenome: " +pessoa.getSobrenome());
		System.out.println("telefone: " +pessoa.getTelefone());
		System.out.println("celular: " +pessoa.getCelular());
	}

}
