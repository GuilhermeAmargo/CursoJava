public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("Queijo");
        pizza1.adicionaIngrediente("Tomate");

        Pizza pizza2 = new Pizza();
        pizza2.adicionaIngrediente("Queijo");
        pizza2.adicionaIngrediente("Frango");
        pizza2.adicionaIngrediente("Catupiry");

        Pizza pizza3 = new Pizza();
        pizza3.adicionaIngrediente("Queijo");
        pizza3.adicionaIngrediente("Calabresa");
        pizza3.adicionaIngrediente("Cebola");
        pizza3.adicionaIngrediente("Azeitona");
        pizza3.adicionaIngrediente("Ovo");
        pizza3.adicionaIngrediente("Pimentão");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionaPizza(pizza1);
        carrinho.adicionaPizza(pizza2);
        carrinho.adicionaPizza(pizza3);

        System.out.println("Total do Carrinho de Compras: " + carrinho.getValorTotal());

        System.out.println("Quantidade utilizada de cada ingrediente:");
        Pizza.imprimeQuantidadeDeCadaIngrediente();
    }
}
