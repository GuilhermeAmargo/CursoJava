public class Teste {
    public static void main(String[] args) {
        CompraParcelada compra1 = new CompraParcelada(1000.0, 1, 0.01);
        System.out.println("Total para 1 parcela: " + compra1.total());

        CompraParcelada compra2 = new CompraParcelada(1000.0, 2, 0.01);
        System.out.println("Total para 2 parcelas: " + compra2.total());

        CompraParcelada compra5 = new CompraParcelada(1000.0, 5, 0.01);
        System.out.println("Total para 5 parcelas: " + compra5.total());

        CompraParcelada compra10 = new CompraParcelada(1000.0, 10, 0.01);
        System.out.println("Total para 10 parcelas: " + compra10.total());
    }
}
