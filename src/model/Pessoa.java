package model;

import java.util.Date;

public class Pessoa 
{
	private String nome;
	private String sobrenome;
	private String telefone;
	private String celular;
	private Date aniversario;
	private int idade;
	
	public void setNome (String nome)
	{
		this.nome = nome;
	}
	
	public String getNome ()
	{
		return this.nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Date getAniversario() {
		return aniversario;
	}

	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
