public class Main {
    public static void main(String[] args) {
        Barulhento[] barulhentos = new Barulhento[10];

        barulhentos[0] = new Cachorro();
        barulhentos[1] = new Cachorro();
        barulhentos[2] = new Cachorro();
        barulhentos[3] = new Cachorro();
        barulhentos[4] = new Carro();
        barulhentos[5] = new Carro();
        barulhentos[6] = new Carro();
        barulhentos[7] = new Vulvuzela();
        barulhentos[8] = new Bateria();
        barulhentos[9] = new Bateria();

        sons(barulhentos);
    }

    public static void sons(Barulhento[] barulhentos){
        for(Barulhento b : barulhentos){
            System.out.println(b.fazerBarulho());
        }
    }
}
