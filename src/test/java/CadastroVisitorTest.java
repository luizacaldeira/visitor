import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadastroVisitorTest {

    @Test
    void deveExibirClienteB2C() {
        ClienteB2C cliente = new ClienteB2C(1, "Ana", "Fibra 300MB");

        CadastroVisitor visitor = new CadastroVisitor();
        assertEquals("ClienteB2C{codigo=1, nome='Ana', plano='Fibra 300MB'}", visitor.exibir(cliente));
    }

    @Test
    void deveExibirClienteB2B() {
        ClienteB2B cliente = new ClienteB2B(1, "Empresa XPTO", 1500.0f);

        CadastroVisitor visitor = new CadastroVisitor();
        assertEquals("ClienteB2B{codigo=1, razaoSocial='Empresa XPTO', valorContrato=1500.0}", visitor.exibir(cliente));
    }

    @Test
    void deveExibirVendedor() {
        Vendedor vendedor = new Vendedor(1, "Pedro", "Equipe Sul");

        CadastroVisitor visitor = new CadastroVisitor();
        assertEquals("Vendedor{matricula=1, nome='Pedro', equipe='Equipe Sul'}", visitor.exibir(vendedor));
    }

}