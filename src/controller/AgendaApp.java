package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import DAO.PessoaDao;
import model.Pessoa;


public class AgendaApp {

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		int escolha = 1;
		while(escolha != 0)
		{
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Cadastrar pessoa.");
			System.out.println("2 - Listar pessoas.");
			System.out.println("0 - Sair");
			escolha = scn.nextInt();
			scn.nextLine();
		
			if(escolha == 1)
			{
				System.out.println("Entre com o nome:");
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(scn.next());
				scn.nextLine();
				System.out.println("Entre com o sobrenome:");
				pessoa.setSobrenome(scn.next());
				scn.nextLine();
				PessoaDao pessoaDao = new PessoaDao();
				pessoaDao.salvarPessoa(pessoa);
			}
			else if(escolha == 2)
			{
				List<Pessoa> listaPessoa = new ArrayList<>();
				PessoaDao pessoaDao = new PessoaDao();
				listaPessoa = pessoaDao.listarPessoa();
				for(Pessoa pessoar: listaPessoa)
				{
					System.out.println("Nome: " +pessoar.getNome());
					System.out.println("Sobrenome: " +pessoar.getSobrenome());
				}
			}
		}
		scn.close();
	}

}
