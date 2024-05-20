public class CarroSoma extends CarrodeCorrida{
    private int potencia;

    public CarroSoma(String nome, int potencia, int velocidadeMaxima) {
        super(velocidadeMaxima, nome);
        this.potencia = potencia;
    }

    @Override
    public void acelerar(){
        velocidade += potencia;
        if(getVelocidade() > velocidadeMaxima)
            velocidade = velocidadeMaxima;
    }

}
