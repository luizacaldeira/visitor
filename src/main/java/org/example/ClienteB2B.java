package org.example;

public class ClienteB2B implements Cadastro {

    private int codigo;
    private String razaoSocial;
    private float valorContrato;

    public ClienteB2B(int codigo, String razaoSocial, float valorContrato) {
        this.codigo = codigo;
        this.razaoSocial = razaoSocial;
        this.valorContrato = valorContrato;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public float getValorContrato() {
        return valorContrato;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirClienteB2B(this);
    }

}