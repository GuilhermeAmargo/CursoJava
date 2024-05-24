import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class ProcessadorArquivoTest {
    @Test
    public void testProcessarArquivoComSucesso() throws IOException, LeituraArquivoException {
        String nomeArquivo = "arquivo_teste.txt";
        try (FileWriter writer = new FileWriter(nomeArquivo)) {
            writer.write("3\n");
            writer.write("nome->Eduardo\n");
            writer.write("sobrenome->Guerra\n");
            writer.write("idade->35\n");
        }

        Map<String, String> resultado = ProcessadorArquivo.processar(nomeArquivo);
        assertEquals(3, resultado.size());
        assertEquals("Eduardo", resultado.get("nome"));
        assertEquals("Guerra", resultado.get("sobrenome"));
        assertEquals("35", resultado.get("idade"));

        Files.deleteIfExists(Paths.get(nomeArquivo));
    }

    @Test
    public void testArquivoVazio() throws IOException {
        String nomeArquivo = "arquivo_vazio.txt";
        Files.createFile(Paths.get(nomeArquivo));

        LeituraArquivoException exception = assertThrows(LeituraArquivoException.class, () -> {
            ProcessadorArquivo.processar(nomeArquivo);
        });
        assertEquals("Arquivo vazio", exception.getMessage());

        Files.deleteIfExists(Paths.get(nomeArquivo));
    }

    @Test
    public void testFormatoInvalido() throws IOException {
        String nomeArquivo = "arquivo_invalido.txt";
        try (FileWriter writer = new FileWriter(nomeArquivo)) {
            writer.write("3\n");
            writer.write("nome->Eduardo->Silva\n");
        }

        LeituraArquivoException exception = assertThrows(LeituraArquivoException.class, () -> {
            ProcessadorArquivo.processar(nomeArquivo);
        });
        assertEquals("Formato de arquivo inválido", exception.getMessage());

        Files.deleteIfExists(Paths.get(nomeArquivo));
    }

    @Test
    public void testErroAoAbrirArquivo() {
        String nomeArquivo = "arquivo_inexistente.txt";

        LeituraArquivoException exception = assertThrows(LeituraArquivoException.class, () -> {
            ProcessadorArquivo.processar(nomeArquivo);
        });
        assertTrue(exception.getMessage().startsWith("Erro ao abrir o arquivo"));
    }
}
