package org.example;

public interface Visitor {

    String exibirClienteB2C(ClienteB2C cliente);
    String exibirClienteB2B(ClienteB2B cliente);
    String exibirVendedor(Vendedor vendedor);

}