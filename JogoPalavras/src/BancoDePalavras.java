import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class BancoDePalavras {
    private List<String> palavras;
    private Random random;

    public BancoDePalavras(String caminhoArquivo) throws IOException {
        palavras = Files.readAllLines(Paths.get("C:/Users/camar/OneDrive/Desktop/JogoPalavras/palavras.txt"));
        random = new Random();
    }

    public String getPalavraAleatoria() {
        int index = random.nextInt(palavras.size());
        return palavras.get(index);
    }
}
