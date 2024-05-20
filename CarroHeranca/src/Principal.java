public class Principal {
    public static void main(String[] args) {
        Corrida c1 = new Corrida(2000);
        c1.adicionaCarro(new CarroSoma("CarroA",10,110));
        c1.adicionaCarro(new CarroSoma("CarroB",8,140));
        c1.adicionaCarro(new CarroMult("CarroC",1.7,100));
        c1.adicionaCarro(new CarroMult("CarroC",1.4,150));
        c1.umDoisTresEJa();
    }
}
