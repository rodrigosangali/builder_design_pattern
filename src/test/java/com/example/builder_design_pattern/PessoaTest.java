package com.example.builder_design_pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PessoaTest {

    @Test
    public void testPessoa(){
        Pessoa p = new Pessoa.PessoaBuilder()
                .nome("Rodrigo")
                .apelido("JirayaBolado")
                .nomeDoMeio("Suane")
                .nomeDoPai("Willian")
                .ultimoNome("Queiroz")
                .criarPessoa();

        System.out.println(p);
    }

}