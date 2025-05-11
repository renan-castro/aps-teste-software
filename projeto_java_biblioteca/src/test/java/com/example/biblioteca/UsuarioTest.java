package com.example.biblioteca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    void testConstrutorEGetters() {
        Usuario u = new Usuario("Maria", "maria@teste.com", "senha123");
        assertEquals("Maria", u.getNome());
        assertEquals("maria@teste.com", u.getEmail());
        assertEquals("senha123", u.getSenha());
    }

    @Test
    void testSetters() {
        Usuario u = new Usuario("João", "joao@teste.com", "senha");
        u.setNome("João Silva");
        u.setEmail("joaosilva@teste.com");
        u.setSenha("novaSenha");
        assertEquals("João Silva", u.getNome());
        assertEquals("joaosilva@teste.com", u.getEmail());
        assertEquals("novaSenha", u.getSenha());
    }

    @Test
    void testEqualsMesmoEmail() {
        Usuario u1 = new Usuario("Ana", "ana@teste.com", "senha1");
        Usuario u2 = new Usuario("Ana Clara", "ana@teste.com", "senha2");
        assertEquals(u1, u2); // mesmos e-mails
    }

    @Test
    void testEqualsEmailsDiferentes() {
        Usuario u1 = new Usuario("Carlos", "carlos@teste.com", "abc");
        Usuario u2 = new Usuario("Carlos", "carlos2@teste.com", "abc");
        assertNotEquals(u1, u2);
    }

    @Test
    void testHashCode() {
        Usuario u1 = new Usuario("Leo", "leo@teste.com", "senha");
        Usuario u2 = new Usuario("Leonardo", "leo@teste.com", "outraSenha");
        assertEquals(u1.hashCode(), u2.hashCode());
    }

    @Test
    void testEqualsComMesmoObjeto() {
        Usuario u = new Usuario("Ana", "ana@teste.com", "senha");
        assertEquals(u, u); // mesmo objeto
    }

    @Test
    void testEqualsComObjetoDeOutroTipo() {
        Usuario u = new Usuario("Ana", "ana@teste.com", "senha");
        Object outro = new Object();
        assertNotEquals(u, outro); // tipos diferentes
    }

}
