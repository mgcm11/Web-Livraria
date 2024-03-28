package br.com.weblivraria.test;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.weblivraria.dao.DAOUsuario;
import br.com.weblivraria.dominio.Usuario;
import junit.framework.Assert;


public class TestDAOUsuario{

	//Vamos realizar os testes em todos os métodos que estão 
	//classe DAOUsuario.
	
	//Vamos começar testando o cadastro do usuário
	@Test
	public void testCadastroUsuario() {
		//realizar a instância da classe Usuario e aplicar dados
		//ficticios para cadastrar. Esta técnica é chamada de dados
		//mockados
		Usuario us = new Usuario();
		us.setNomeusuario("pedro");
		us.setSenha("123");
		us.setEmail("pedro@uol.com.br");
		us.setTelefone("11-2232-5855");
		us.setNomecompleto("Pedro Pedreira");
		us.setCpf("1212122211212");
		
		//instância da classe  DAOUsuario
		DAOUsuario daous = new DAOUsuario();
		assertEquals("Cadastro realizado", daous.cadastrar(us));
		
		
	}
	
}
