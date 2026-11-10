package org.example;

public class ClienteB2C implements Cadastro {

    private int codigo;
    private String nome;
    private String plano;

    public ClienteB2C(int codigo, String nome, String plano) {
        this.codigo = codigo;
        this.nome = nome;
        this.plano = plano;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getPlano() {
        return plano;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirClienteB2C(this);
    }

}