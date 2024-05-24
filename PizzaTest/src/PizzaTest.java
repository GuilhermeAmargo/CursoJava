import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class PizzaTest {

    @BeforeEach
    public void setup() {
        Pizza.zeraRegistroIngredientes();
    }

    @Test
    public void testPrecoPizzaCom2Ingredientes() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("Queijo");
        pizza.adicionaIngrediente("Tomate");
        assertEquals(15.0, pizza.getPreco());
    }

    @Test
    public void testPrecoPizzaCom3Ingredientes() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("Queijo");
        pizza.adicionaIngrediente("Tomate");
        pizza.adicionaIngrediente("Frango");
        assertEquals(20.0, pizza.getPreco());
    }

    @Test
    public void testPrecoPizzaCom6Ingredientes() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("Queijo");
        pizza.adicionaIngrediente("Tomate");
        pizza.adicionaIngrediente("Frango");
        pizza.adicionaIngrediente("Calabresa");
        pizza.adicionaIngrediente("Cebola");
        pizza.adicionaIngrediente("Ovo");
        assertEquals(23.0, pizza.getPreco());
    }

    @Test
    public void testRegistroIngredientes() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("Queijo");
        pizza.adicionaIngrediente("Tomate");
        pizza.adicionaIngrediente("Frango");

        Map<String, Integer> registro = Pizza.getContagemIngredientes();
        assertEquals(1, registro.get("Queijo"));
        assertEquals(1, registro.get("Tomate"));
        assertEquals(1, registro.get("Frango"));
    }
}
