package com.example.builder_design_pattern;

import lombok.Builder;

@Builder
public class Pessoa {

    private String nome;
    private String ultimoNome;
    private String nomeDoMeio;
    private String apelido;
    private String nomeDoPai;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", ultimoNome='" + ultimoNome + '\'' +
                ", nomeDoMeio='" + nomeDoMeio + '\'' +
                ", apelido='" + apelido + '\'' +
                ", nomeDoPai='" + nomeDoPai + '\'' +
                '}';
    }
}
