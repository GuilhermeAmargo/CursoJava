import java.util.Random;

public class FabricaEmbaralhadores {
    private static Random random = new Random();

    public static Embaralhador getEmbaralhadorAleatorio() {
        if (random.nextBoolean()) {
            return new EmbaralhadorInvertido();
        } else {
            return new EmbaralhadorAleatorio();
        }
    }
}
