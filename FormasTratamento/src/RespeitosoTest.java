import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RespeitosoTest {

    @Test
    public void testFormatarNomeMasculino() {
        FormatadorNome formatador = new Respeitoso(true);
        Autoridade autoridade = new Autoridade("Pedro", "Silva", formatador);
        assertEquals("Sr. Silva", autoridade.getTratamento());
    }

    @Test
    public void testFormatarNomeFeminino() {
        FormatadorNome formatador = new Respeitoso(false);
        Autoridade autoridade = new Autoridade("Maria", "Silva", formatador);
        assertEquals("Sra. Silva", autoridade.getTratamento());
    }
}
