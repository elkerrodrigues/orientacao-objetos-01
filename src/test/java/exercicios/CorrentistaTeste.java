package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CorrentistaTeste {
    @Test
    public void criarObjetoCorrentista() {
        Correntista c1 = new Correntista();
        assertNotNull(c1);
    }
   /* public String codigo;
    public String nome;
    public String email;
    public String telefone ;*/
    @Test
    public void presencaAtributoCodigo() {
        Correntista c1 = new Correntista();
        c1.codigo = "1234";
        assertNotNull(c1.codigo);
    }
    @Test
    public void presencaAtributoNome() {
        Correntista c1 = new Correntista();
        c1.nome = "Antonio";
        assertNotNull(c1.nome);
    }
    @Test
    public void presencaAtributoEmail() {
        Correntista c1 = new Correntista();
        c1.email = "ant@email.com";
        assertNotNull(c1.email);
    }
    @Test
    public void presencaAtributoTelefone() {
        Correntista c1 = new Correntista();
        c1.telefone = "40028922";
        assertNotNull(c1.telefone);
    }
}
