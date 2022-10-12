package com.example.builder_design_pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PessoaTest {

    @Test
    public void testPessoa(){
        Pessoa.BuildName p = new Pessoa.BuildName.BuildNameBuilder()
                .nome("Rodrigo")
                .apelido("JirayaBolado")
                .nomeDoMeio("Suane")
                .nomeDoPai("Willian")
                .ultimoNome("Queiroz")
                .build();

        System.out.println(p);
    }

    private class PessoaBBuilder {
    }
}