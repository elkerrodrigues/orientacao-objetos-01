package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CirculoTeste {

    @Test
    public void criarObjetoCirculo() {
        Circulo c1 = new Circulo();
        assertNotNull(c1);
    }

    @Test
    public void presencaAtributoBase() {
        Circulo c1 = new Circulo();
        c1.raio = 10.0;
        assertNotNull(c1.raio);
    }

    @Test
    public void metodoCalcularArea() {
        Circulo c1 = new Circulo();
        c1.raio = 10.0;
        Double valorEsperado = 314.0;
        Double valorObtido = c1.calcularArea();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularPerimetro() {
        Circulo c1 = new Circulo();
        c1.raio = 10.0;
        Double valorEsperado = 20.0 * 3.14;
        Double valorObtido = c1.calcularPerimetro();
        assertEquals(valorEsperado, valorObtido);
    }
}



