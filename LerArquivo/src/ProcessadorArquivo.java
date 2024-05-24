import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProcessadorArquivo {
    public static Map<String, String> processar(String nomeArquivo) throws LeituraArquivoException {
        File arquivo = new File(nomeArquivo);
        try (Scanner scanner = new Scanner(arquivo)) {
            if (!scanner.hasNextLine()) {
                throw new LeituraArquivoException("Arquivo vazio");
            }

            int numeroLinhas = Integer.parseInt(scanner.nextLine().trim());
            Map<String, String> mapa = new HashMap<>();

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] partes = linha.split("->");

                if (partes.length != 2) {
                    throw new LeituraArquivoException("Formato de arquivo inválido");
                }

                mapa.put(partes[0].trim(), partes[1].trim());
            }

            if (mapa.size() != numeroLinhas) {
                throw new LeituraArquivoException("Número de linhas não corresponde ao especificado");
            }

            return mapa;
        } catch (FileNotFoundException e) {
            throw new LeituraArquivoException("Erro ao abrir o arquivo: " + e.getMessage(), e);
        } catch (IOException e) {
            throw new LeituraArquivoException("Erro ao abrir o arquivo: " + e.getMessage(), e);
        } catch (NumberFormatException e) {
            throw new LeituraArquivoException("Formato de número inválido: " + e.getMessage(), e);
        }
    }
}
