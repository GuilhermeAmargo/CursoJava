import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarrinhoDeComprasTest {
    @Test
    public void testAdicionaProduto() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Produto p1 = new Produto("Produto1", "123", 10.0);
        carrinho.adicionaProduto(p1, 2);
        assertEquals(2, (int) carrinho.getProdutos().get(p1));
    }

    @Test
    public void testRemoveProduto() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Produto p1 = new Produto("Produto1", "123", 10.0);
        carrinho.adicionaProduto(p1, 2);
        carrinho.removeProduto(p1, 1);
        assertEquals(1, (int) carrinho.getProdutos().get(p1));
        carrinho.removeProduto(p1, 1);
        assertFalse(carrinho.getProdutos().containsKey(p1));
    }

    @Test
    public void testCalcularValorTotal() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Produto p1 = new Produto("Produto1", "123", 10.0);
        Produto p2 = new Produto("Produto2", "124", 15.0);
        carrinho.adicionaProduto(p1, 2);
        carrinho.adicionaProduto(p2, 1);
        assertEquals(35.0, carrinho.calculaValorTotal(), 0.001);
    }
}

