package com.example.builder_design_pattern;

import org.junit.jupiter.api.Test;


class PessoaTest {

    @Test
    public void testPessoa(){
        Pessoa p = new Pessoa.PessoaBuilder()
                .nome("Rodrigo")
                .apelido("JirayaBolado")
                .nomeDoMeio("Suane")
                .nomeDoPai("Willian")
                .ultimoNome("Queiroz")
                .build();

        System.out.println(p);
    }

}