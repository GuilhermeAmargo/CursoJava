import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
    private Map<Produto, Integer> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new HashMap<>();
    }

    public void adicionaProduto(Produto produto, int quantidade) {
        produtos.put(produto, produtos.getOrDefault(produto, 0) + quantidade);
    }

    public void removeProduto(Produto produto, int quantidade) {
        if (produtos.containsKey(produto)) {
            int novaQuantidade = produtos.get(produto) - quantidade;
            if (novaQuantidade <= 0) {
                produtos.remove(produto);
            } else {
                produtos.put(produto, novaQuantidade);
            }
        }
    }

    public double calculaValorTotal() {
        double total = 0.0;
        for (Map.Entry<Produto, Integer> entry : produtos.entrySet()) {
            total += entry.getKey().getPreco() * entry.getValue();
        }
        return total;
    }

    public Map<Produto, Integer> getProdutos() {
        return produtos;
    }
}
