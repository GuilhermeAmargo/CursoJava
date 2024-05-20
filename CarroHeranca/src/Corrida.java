import java.util.HashMap;
import java.util.Map;

public class Corrida {

    private int pista;
    private Map<CarrodeCorrida, Integer> carros = new HashMap<>();

    public Corrida(int tamanho){
        pista = tamanho;
    }

    public void adicionaCarro(CarrodeCorrida carro){
        carros.put(carro, 0);
    }

    private boolean terminou(){
        for(Integer valor : carros.values()){
            if(valor > pista)
                return true;
        }
        return false;
    }
    public void umDoisTresEJa() {
        while (!terminou()) {
            for (CarrodeCorrida carro : carros.keySet()) {
                carro.acelerar();
                int distancia = carros.get(carro);
                distancia += carro.getVelocidade();
                carros.put(carro, distancia);

            }
        }

        for (CarrodeCorrida carro : carros.keySet()) {
            System.out.println(carro.getNome() + " - " + carros.get(carro));
        }
    }
}
