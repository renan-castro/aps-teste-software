package com.example.biblioteca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CadastroTest {

    @Test
    void testCadastrarUsuarioValido() {
        Usuario usuarioParaCadastro = Cadastro.cadastrarUsuario("João", "joao@empresa.com", "Senha123");
        assertNotNull(usuarioParaCadastro);
        assertEquals("joao@empresa.com", usuarioParaCadastro.getEmail());

        Usuario usuarioJaCadastrado = Cadastro.cadastrarUsuario("João", "joao@empresa.com", "Senha123");
        assertNull(usuarioJaCadastrado);
    }

    @Test
    void testAtualizarUsuario() {
        Usuario u = Cadastro.cadastrarUsuario("João", "joao@empresa.com", "Senha123");
        Usuario user = new Usuario("Teste", "joao@empresa.com", "Senha324");

        Cadastro.atualizarUsuario(user, "Maria", "joao@empresa.com", "Senha456");
        assertEquals("Maria", user.getNome());
        assertEquals("joao@empresa.com", user.getEmail());
        assertEquals("Senha456", user.getSenha());
    }

    @Test
    void testAtualizarUsuarioNaoExistente() {
        Usuario u = new Usuario("Fantasma", "fantasma@naoexiste.com", "123");
        boolean atualizado = Cadastro.atualizarUsuario(u, "Outro", "outro@email.com", "456");
        assertFalse(atualizado);
    }

    @Test
    void testExcluirUsuario() {
        Usuario u = Cadastro.cadastrarUsuario("Maria", "maria@empresa.com", "Senha123");
        assertTrue(Cadastro.excluirUsuario(u));
        assertFalse(Cadastro.excluirUsuario(u));
    }

    @Test
    void testAlterarParcialNome() {
        Usuario u = Cadastro.cadastrarUsuario("Pedro", "pedro@empresa.com", "123");
        Usuario user = new Usuario("Pedro", "pedro@empresa.com", "123");
        boolean alterado = Cadastro.alterarParcial(user, "nome", "Pedro Silva");
        assertTrue(alterado);
        assertEquals("Pedro Silva", user.getNome());
    }

    @Test
    void testAlterarParcialEmail() {
        Usuario u = Cadastro.cadastrarUsuario("Ana", "ana@empresa.com", "abc");
        Usuario user = new Usuario("Ana", "ana@empresa.com", "abc");
        boolean alterado = Cadastro.alterarParcial(user, "email", "ana.nova@empresa.com");
        assertTrue(alterado);
        assertEquals("ana.nova@empresa.com", user.getEmail());
    }

    @Test
    void testAlterarParcialSenha() {
        Usuario u = Cadastro.cadastrarUsuario("Lucas", "lucas@empresa.com", "senha");
        Usuario user = new Usuario("Lucas", "lucas@empresa.com", "senha");
        boolean alterado = Cadastro.alterarParcial(user, "senha", "novaSenha123");
        assertTrue(alterado);
        assertEquals("novaSenha123", user.getSenha());
    }


    @Test
    void testAlterarParcialCampoInvalido() {
        Usuario u = Cadastro.cadastrarUsuario("Lara", "lara@empresa.com", "321");
        Usuario user = new Usuario("Lara", "lara@empresa.com", "321");
        boolean alterado = Cadastro.alterarParcial(user, "idade", "30");
        assertFalse(alterado);
    }

    @Test
    void testAlterarParcialUsuarioInexistente() {
        Usuario u = new Usuario("Fake", "fake@user.com", "123");
        Usuario user = new Usuario("Fake", "fake@user.com", "321");
        boolean alterado = Cadastro.alterarParcial(user, "nome", "Novo Nome");
        assertFalse(alterado);
    }

    @Test
    void testCadastroFunc0() {
        assertEquals("CADASTRO_0", Cadastro.cadastroFunc0());
    }

    @Test
    void testeCadastroFunc1() {
        assertEquals("CADASTRO_1", Cadastro.cadastroFunc1());
    }
}
