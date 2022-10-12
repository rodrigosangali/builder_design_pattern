package com.example.builder_design_pattern;

public class Pessoa {

    private String nome;
    private String ultimoNome;
    private String nomeDoMeio;
    private String apelido;
    private String nomeDoPai;

    private Pessoa(String nome, String ultimoNome, String nomeDoMeio, String apelido, String nomeDoPai) {
        this.nome = nome;
        this.ultimoNome = ultimoNome;
        this.nomeDoMeio = nomeDoMeio;
        this.apelido = apelido;
        this.nomeDoPai = nomeDoPai;
    }

    public static class PessoaBuilder{
        private String nome;
        private String ultimoNome;
        private String nomeDoMeio;
        private String apelido;
        private String nomeDoPai;

        public PessoaBuilder() {

        }

        public PessoaBuilder nome(String nome){
            this.nome = nome;
            return this;
        }

        public PessoaBuilder ultimoNome(String ultimoNome){
            this.ultimoNome = ultimoNome;
            return this;
        }
        public PessoaBuilder nomeDoMeio(String nomeDoMeio){
            this.nomeDoMeio = nomeDoMeio;
            return this;
        }
        public PessoaBuilder apelido(String apelido){
            this.apelido = apelido;
            return this;
        }
        public PessoaBuilder nomeDoPai(String nomeDoPai){
            this.nomeDoPai = nomeDoPai;
            return this;
        }

        public Pessoa criarPessoa(){
            return new Pessoa(nome, ultimoNome, nomeDoMeio, apelido, nomeDoPai);
        }

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
