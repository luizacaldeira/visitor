package org.example;

public class Vendedor implements Cadastro {

    private int matricula;
    private String nome;
    private String equipe;

    public Vendedor(int matricula, String nome, String equipe) {
        this.matricula = matricula;
        this.nome = nome;
        this.equipe = equipe;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getEquipe() {
        return equipe;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirVendedor(this);
    }

}