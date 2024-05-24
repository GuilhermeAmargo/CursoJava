import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoComTamanhoTest {
    @Test
    public void testEquals() {
        ProdutoComTamanho p1 = new ProdutoComTamanho("Produto1", "123", 10.0, "M");
        ProdutoComTamanho p2 = new ProdutoComTamanho("Produto2", "123", 10.0, "M");
        ProdutoComTamanho p3 = new ProdutoComTamanho("Produto3", "123", 10.0, "L");
        assertEquals(p1, p2);
        assertNotEquals(p1, p3);
    }

    @Test
    public void testHashCode() {
        ProdutoComTamanho p1 = new ProdutoComTamanho("Produto1", "123", 10.0, "M");
        ProdutoComTamanho p2 = new ProdutoComTamanho("Produto2", "123", 10.0, "M");
        ProdutoComTamanho p3 = new ProdutoComTamanho("Produto3", "123", 10.0, "L");
        assertEquals(p1.hashCode(), p2.hashCode());
        assertNotEquals(p1.hashCode(), p3.hashCode());
    }
}

