public class CompraParcelada extends Compra {
    private int parcelas;
    private double juros;

    public CompraParcelada(double total, int parcelas, double juros) {
        super(total);
        this.parcelas = parcelas;
        this.juros = juros;
    }

    @Override
    public double total() {
        return total * Math.pow(1 + juros, parcelas);
    }
}