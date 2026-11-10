package org.example;

public class CadastroVisitor implements Visitor {

    public String exibir(Cadastro cadastro) {
        return cadastro.aceitar(this);
    }

    @Override
    public String exibirClienteB2C(ClienteB2C cliente) {
        return "ClienteB2C{" +
                "codigo=" + cliente.getCodigo() +
                ", nome='" + cliente.getNome() + '\'' +
                ", plano='" + cliente.getPlano() + '\'' +
                '}';
    }

    @Override
    public String exibirClienteB2B(ClienteB2B cliente) {
        return "ClienteB2B{" +
                "codigo=" + cliente.getCodigo() +
                ", razaoSocial='" + cliente.getRazaoSocial() + '\'' +
                ", valorContrato=" + cliente.getValorContrato() +
                '}';
    }

    @Override
    public String exibirVendedor(Vendedor vendedor) {
        return "Vendedor{" +
                "matricula=" + vendedor.getMatricula() +
                ", nome='" + vendedor.getNome() + '\'' +
                ", equipe='" + vendedor.getEquipe() + '\'' +
                '}';
    }
}
