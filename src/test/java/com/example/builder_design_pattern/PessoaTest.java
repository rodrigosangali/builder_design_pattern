package com.example.builder_design_pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PessoaTest {

    @Test
    public void testPessoa(){
        Pessoa p =  new Pessoa(
                "Rodrigo", "Queiroz", "Suane", "JirayaBolado", "Willian");

        System.out.println(p);
    }

}