import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class InformalTest {

    @Test
    public void testFormatarNome() {
        FormatadorNome formatador = new Informal();
        Autoridade autoridade = new Autoridade("Pedro", "Silva", formatador);
        assertEquals("Pedro", autoridade.getTratamento());
    }
}
