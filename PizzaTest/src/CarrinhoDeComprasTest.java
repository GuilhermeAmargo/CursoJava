import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarrinhoDeComprasTest {

    @BeforeEach
    public void setup() {
        Pizza.zeraRegistroIngredientes();
    }

    @Test
    public void testAdicionaPizzaComIngredientes() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("Queijo");
        carrinho.adicionaPizza(pizza);

        assertEquals(1, carrinho.getPizzas().size());
    }

    @Test
    public void testNaoAdicionaPizzaSemIngredientes() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Pizza pizza = new Pizza();
        carrinho.adicionaPizza(pizza);

        assertEquals(0, carrinho.getPizzas().size());
    }

    @Test
    public void testValorTotalCarrinho() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("Queijo");
        pizza1.adicionaIngrediente("Tomate");

        Pizza pizza2 = new Pizza();
        pizza2.adicionaIngrediente("Queijo");
        pizza2.adicionaIngrediente("Frango");
        pizza2.adicionaIngrediente("Catupiry");

        Pizza pizza3 = new Pizza();
        pizza3.adicionaIngrediente("Queijo");
        pizza3.adicionaIngrediente("Calabresa");
        pizza3.adicionaIngrediente("Cebola");
        pizza3.adicionaIngrediente("Azeitona");
        pizza3.adicionaIngrediente("Ovo");
        pizza3.adicionaIngrediente("Pimentão");

        carrinho.adicionaPizza(pizza1);
        carrinho.adicionaPizza(pizza2);
        carrinho.adicionaPizza(pizza3);

        assertEquals(15.0 + 20.0 + 23.0, carrinho.getValorTotal());
    }
}