import java.util.Random;

public class FabricaMecanicaDoJogo {
    public static MecanicaDoJogo getMecanicaDoJogo(BancoDePalavras banco) {
        if (new Random().nextBoolean()) {
            return new MecanicaSimples(banco);
        } else {
            return new MecanicaDificil(banco);
        }
    }
}
