
package com.example.biblioteca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidacoesTest {
    @Test
    void testEmailValido() {
        // Teste com um email válido
        assertTrue(Validacoes.emailValido("teste@exemplo.com"));

        // Teste com um email inválido (sem "@")
        assertFalse(Validacoes.emailValido("testeexemplo.com"));

        // Teste com uma string vazia
        assertFalse(Validacoes.emailValido(""));

        // Teste com um valor nulo
        assertFalse(Validacoes.emailValido(null));
    }

    @Test
    void testSenhaForte() {
        // Teste com uma senha forte (contém maiúscula, minúscula e número)
        assertTrue(Validacoes.senhaForte("Abcdef1g"));

        // Teste com uma senha sem letras maiúsculas
        assertFalse(Validacoes.senhaForte("abcdef1g"));

        // Teste com uma senha sem letras minúsculas
        assertFalse(Validacoes.senhaForte("ABCDEFG1"));

        // Teste com uma senha sem números
        assertFalse(Validacoes.senhaForte("Abcdefgh"));

        // Teste com uma senha muito curta
        assertFalse(Validacoes.senhaForte("Ab1"));

        // Teste com uma senha nula
        assertFalse(Validacoes.senhaForte(null));

        // Teste com uma senha vazia
        assertFalse(Validacoes.senhaForte(""));

        // Teste com uma senha que contém apenas números
        assertFalse(Validacoes.senhaForte("12345678"));
    }

    @Test
    void testNomeValido() {
        // Teste com um nome válido
        assertTrue(Validacoes.nomeValido("Nome Válido"));

        // Teste com um nome inválido (apenas espaços)
        assertFalse(Validacoes.nomeValido("   "));

        // Teste com o nome nulo
        assertFalse(Validacoes.nomeValido(null));
    }
}
