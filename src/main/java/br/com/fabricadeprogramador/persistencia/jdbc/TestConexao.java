package br.com.fabricadeprogramador.persistencia.jdbc;

import br.com.fabricadeprogramador.entidades.Usuario;
import br.com.fabricadeprogramador.persistencia.dao.UsuarioDAO;

public class TestConexao {

	public static void main(String[] args) {	
		
			UsuarioDAO usuarioDAO = new UsuarioDAO();
			
			Usuario usu = new Usuario();
			usu.setId(1);
			usu.setNome("Jão ALTERADO!");
			usu.setLogin("Jaoaoaoa");
			usu.setSenha("212121");
			
			//usuarioDAO.cadastrar(usu);
			
			usuarioDAO.alterar(usu);

	}

}
