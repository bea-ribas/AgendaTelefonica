package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Pessoa;
import util.ConnectionFactory;

public class PessoaDao 
{
	final String salvarPessoaStmt = "insert into pessoa (nome, sobrenome) values (?, ?)";
	final String listarPessoaStmt = "select * from pessoa";
	
	public void salvarPessoa (Pessoa pessoa)
	{
		Connection con = null;
		PreparedStatement stmt = null;
		try
		{
			con = ConnectionFactory.getConnection();
			stmt = con.prepareStatement(salvarPessoaStmt);
			stmt.setString(1,pessoa.getNome());
			stmt.setString(2,pessoa.getSobrenome());
			stmt.executeUpdate();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public List<Pessoa> listarPessoa()
	{
		Connection con = null;
		PreparedStatement stmt = null;
		try
		{
			con = ConnectionFactory.getConnection();
			stmt = con.prepareStatement(listarPessoaStmt);
			ResultSet rs = null;
			rs = stmt.executeQuery();
			
			List<Pessoa> listaPessoa = new ArrayList<>();
			while (rs.next())
			{
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(rs.getString("nome"));
				pessoa.setSobrenome(rs.getString("sobrenome"));
				listaPessoa.add(pessoa);
			}
			return listaPessoa;
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}
}
