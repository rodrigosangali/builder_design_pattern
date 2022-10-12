package com.example.builder_design_pattern;

public class Pessoa {

    private String nome;
    private String ultimoNome;
    private String nomeDoMeio;
    private String apelido;
    private String nomeDoPai;

    public Pessoa(String nome, String ultimoNome, String nomeDoMeio, String apelido, String nomeDoPai) {
        this.nome = nome;
        this.ultimoNome = ultimoNome;
        this.nomeDoMeio = nomeDoMeio;
        this.apelido = apelido;
        this.nomeDoPai = nomeDoPai;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public void setNomeDoMeio(String nomeDoMeio) {
        this.nomeDoMeio = nomeDoMeio;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public String getNome() {
        return nome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public String getNomeDoMeio() {
        return nomeDoMeio;
    }

    public String getApelido() {
        return apelido;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

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
