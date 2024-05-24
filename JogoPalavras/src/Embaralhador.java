import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public interface Embaralhador {
    String embaralhar(String palavra);
    int getDificuldade(); // Método para retornar a dificuldade do embaralhador
}

class EmbaralhadorInvertido implements Embaralhador {
    @Override
    public String embaralhar(String palavra) {
        return new StringBuilder(palavra).reverse().toString();
    }

    @Override
    public int getDificuldade() {
        return 1;
    }
}

class EmbaralhadorAleatorio implements Embaralhador {
    @Override
    public String embaralhar(String palavra) {
        List<String> letras = Arrays.asList(palavra.split(""));
        Collections.shuffle(letras);
        StringBuilder palavraEmbaralhada = new StringBuilder();
        for (String letra : letras) {
            palavraEmbaralhada.append(letra);
        }
        return palavraEmbaralhada.toString();
    }

    @Override
    public int getDificuldade() {
        return 2;
    }
}
