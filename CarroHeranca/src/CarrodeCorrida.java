public abstract class CarrodeCorrida {
    protected int velocidade;
    protected int velocidadeMaxima;
    protected String nome;

    public CarrodeCorrida(int velocidadeMaxima, String nome) {
        this.velocidade = 0;
        this.velocidadeMaxima = velocidadeMaxima;
        this.nome = nome;
    }

    public abstract void acelerar();

    public void frear(){
        velocidade = velocidade/2;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public String getNome() {
        return nome;
    }
}
