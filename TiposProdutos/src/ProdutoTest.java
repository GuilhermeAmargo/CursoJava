import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {
    @Test
    public void testEquals() {
        Produto p1 = new Produto("Produto1", "123", 10.0);
        Produto p2 = new Produto("Produto2", "123", 15.0);
        assertEquals(p1, p2);
    }

    @Test
    public void testHashCode() {
        Produto p1 = new Produto("Produto1", "123", 10.0);
        Produto p2 = new Produto("Produto2", "123", 15.0);
        assertEquals(p1.hashCode(), p2.hashCode());
    }
}

