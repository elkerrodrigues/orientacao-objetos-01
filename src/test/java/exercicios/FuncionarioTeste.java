package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FuncionarioTeste {
    @Test
    public void criarObjetoFuncionario() {
        Funcionario f1 = new Funcionario();
        assertNotNull(f1);
    }
    /* public String nome;
    public String email;
    public Integer idade;
    public Double salario;
    String obterDados
    void promover(Double porcentagemAumento)*/

    @Test
    public void presencaAtributoNome() {
        Funcionario f1 = new Funcionario();
        f1.nome = "Joao da Silva";
        assertNotNull(f1.nome);
    }

    @Test
    public void presencaAtributoEmail() {
        Funcionario f1 = new Funcionario();
        f1.email = "joao@email.com";
        assertNotNull(f1.email);
    }

    @Test
    public void presencaAtributoIdade() {
        Funcionario f1 = new Funcionario();
        f1.idade = 33;
        assertNotNull(f1.idade);
    }

    @Test
    public void presencaAtributoSalario() {
        Funcionario f1 = new Funcionario();
        f1.salario = 3000.0;
        assertNotNull(f1.salario);
    }

    @Test
    public void metodoObterDados() {
        Funcionario f1 = new Funcionario();
        f1.nome = "Joao da Silva";
        f1.idade = 33;
        f1.email = "joao@email.com";
        String valorEsperado = "Joao da Silva, 33 anos (joao@email.com)";
        String valorObtido = f1.obterDados();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoPromover() {
        Funcionario f1 = new Funcionario();
        f1.salario = 3000.0;
        Double valorEsperado = 3300.0;
        f1.promover(10.0);
        Double valorObtido = f1.salario;
        assertEquals(valorEsperado, valorObtido);
    }
}
