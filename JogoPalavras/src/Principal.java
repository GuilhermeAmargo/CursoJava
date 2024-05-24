import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try {
            BancoDePalavras bancoDePalavras = new BancoDePalavras("palavras.txt");
            MecanicaDoJogo mecanica = FabricaMecanicaDoJogo.getMecanicaDoJogo(bancoDePalavras);
            Scanner in = new Scanner(System.in);

            System.out.println("Bem-vindo ao Jogo das Palavras Embaralhadas!");

            while (!mecanica.terminou()) {
                String palavraEmbaralhada = mecanica.getProximaPalavraEmbaralhada();
                System.out.println("Adivinhe a palavra: " + palavraEmbaralhada);
                String resposta = in.nextLine();

                if (mecanica.tentativa(resposta)) {
                    System.out.println("Correto!");
                } else {
                    System.out.println("Incorreto!");
                }
            }

            System.out.println("Fim de jogo! Sua pontuação final é: " + mecanica.getPontuacao());

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo de palavras: " + e.getMessage());
        }
    }
}
