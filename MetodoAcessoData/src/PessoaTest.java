import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class PessoaTest {

    @Test
    public void testGetIdade() {
        Pessoa pessoa1 = new Pessoa(LocalDate.of(2000, 5, 15));
        Pessoa pessoa2 = new Pessoa(LocalDate.of(1995, 11, 30));
        Pessoa pessoa3 = new Pessoa(LocalDate.of(1980, 2, 20));
        assertEquals(24, pessoa1.getIdade());  // Considerando o ano atual 2024
        assertEquals(28, pessoa2.getIdade());
        assertEquals(44, pessoa3.getIdade());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa2.getIdade());
        System.out.println(pessoa3.getIdade());
    }

    @Test
    public void testGetSigno() {
        Pessoa pessoa1 = new Pessoa(LocalDate.of(2000, 5, 15));
        Pessoa pessoa2 = new Pessoa(LocalDate.of(1995, 11, 30));
        Pessoa pessoa3 = new Pessoa(LocalDate.of(1980, 2, 20));
        assertEquals("Touro", pessoa1.getSigno());
        assertEquals("Sagitário", pessoa2.getSigno());
        assertEquals("Peixes", pessoa3.getSigno());
        System.out.println(pessoa1.getSigno());
        System.out.println(pessoa2.getSigno());
        System.out.println(pessoa3.getSigno());
    }
}
