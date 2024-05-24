public interface MecanicaDoJogo {
    boolean terminou();
    boolean tentativa(String palavra);
    int getPontuacao();
    String getProximaPalavraEmbaralhada();
}

class MecanicaSimples implements MecanicaDoJogo {
    private BancoDePalavras bancoDePalavras;
    private Embaralhador embaralhador;
    private int pontuacao;
    private int tentativas;
    private String palavraAtual;

    public MecanicaSimples(BancoDePalavras banco) {
        this.bancoDePalavras = banco;
        this.embaralhador = FabricaEmbaralhadores.getEmbaralhadorAleatorio();
        this.pontuacao = 0;
        this.tentativas = 0;
    }

    @Override
    public boolean terminou() {
        return tentativas >= 5; // Jogo termina após 5 tentativas
    }

    @Override
    public boolean tentativa(String palavra) {
        tentativas++;
        if (palavra.equals(palavraAtual)) {
            pontuacao += 10 * embaralhador.getDificuldade();
            return true;
        }
        return false;
    }

    @Override
    public int getPontuacao() {
        return pontuacao;
    }

    @Override
    public String getProximaPalavraEmbaralhada() {
        palavraAtual = bancoDePalavras.getPalavraAleatoria();
        return embaralhador.embaralhar(palavraAtual);
    }
}

class MecanicaDificil implements MecanicaDoJogo {
    private BancoDePalavras bancoDePalavras;
    private Embaralhador embaralhador;
    private int pontuacao;
    private int tentativas;
    private int erros;
    private String palavraAtual;

    public MecanicaDificil(BancoDePalavras banco) {
        this.bancoDePalavras = banco;
        this.embaralhador = FabricaEmbaralhadores.getEmbaralhadorAleatorio();
        this.pontuacao = 0;
        this.tentativas = 0;
        this.erros = 0;
    }

    @Override
    public boolean terminou() {
        return erros >= 3; // Jogo termina após 3 erros
    }

    @Override
    public boolean tentativa(String palavra) {
        tentativas++;
        if (palavra.equals(palavraAtual)) {
            pontuacao += 15 * embaralhador.getDificuldade();
            return true;
        } else {
            erros++;
            return false;
        }
    }

    @Override
    public int getPontuacao() {
        return pontuacao;
    }

    @Override
    public String getProximaPalavraEmbaralhada() {
        palavraAtual = bancoDePalavras.getPalavraAleatoria();
        return embaralhador.embaralhar(palavraAtual);
    }
}
