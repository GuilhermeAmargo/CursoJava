import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ComTituloTest {

    @Test
    public void testFormatarNome() {
        FormatadorNome formatador = new ComTitulo("Magnífico");
        Autoridade autoridade = new Autoridade("Pedro", "Cabral", formatador);
        assertEquals("Magnífico Pedro Cabral", autoridade.getTratamento());
    }
}
