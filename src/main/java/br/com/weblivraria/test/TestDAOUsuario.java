package br.com.weblivraria.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.weblivraria.dao.DAOUsuario;
import br.com.weblivraria.dominio.Usuario;

public class TestDAOUsuario {

	// Vamos realizar os testes em todos os métodos que estão
	// classe DAOUsuario.

	// Vamos começar testando o cadastro do usuário
//	@Test
//	public void testCadastroUsuario() {
//		//realizar a instância da classe Usuario e aplicar dados
//		//ficticios para cadastrar. Esta técnica é chamada de dados
//		//mockados
//		Usuario us = new Usuario();
//		us.setNomeusuario("valeria");
//		us.setSenha("123");
//		us.setEmail("valeria@terra.com.br");
//		us.setTelefone("11-2232-5855");
//		us.setNomecompleto("Valéria Gomes");
//		us.setCpf("6568659895");
//		
//		//instância da classe  DAOUsuario
//		DAOUsuario daous = new DAOUsuario();
//		assertEquals("Cadastro realizado", daous.cadastrar(us));	
//	}
//	@Test
//	public void testListar() {
//		DAOUsuario daous = new DAOUsuario();
//		List<Usuario> resultado=new ArrayList<Usuario>();
//		assertEquals(resultado, daous.listar());		
//	}
//	@Test
//public void testPesquisar() {
//	DAOUsuario daous = new DAOUsuario();
//	Usuario us = new Usuario();
//	Usuario usuario_id = new Usuario();
//	
//	usuario_id.setIdusuario(1);
//	
//	assertEquals("pedro", daous.pesquisar(usuario_id).getNomeusuario());
//	
//}
//	@Test
//	public void testAtualizar() {
//		Usuario us_test = new Usuario();
//		us_test.setIdusuario(1);
//		us_test.setNomeusuario("pedro.pedreira");
//		us_test.setEmail("pp@outlook.com");
//		us_test.setTelefone("(11) 5689-9658");
//		us_test.setNomecompleto("Pedro Pedreira Nascimento");
//		
//		DAOUsuario daous = new DAOUsuario();
//		
//		assertEquals("Atualização realizada", daous.atualizar(us_test));
//		
//	}	
	
	
//	@Test
//	public void testLogin() {
//		Usuario us = new Usuario();
//		us.setNomeusuario("pedro.pedreira");
//		us.setSenha("123");
//		
//		DAOUsuario daous = new DAOUsuario();
//		assertTrue(daous.login(us)); 
//	}
	
	
	@Test
	public void testAlterarSenha() {
		Usuario us = new Usuario();
		us.setSenha("abc123");
		us.setIdusuario(1);
		DAOUsuario daous = new DAOUsuario();
		assertEquals("Atualização realizada", daous.alterarSenha(us));
	}
}











