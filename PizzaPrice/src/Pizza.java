import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



class Pizza {
    private List<String> ingredientes = new ArrayList<>();
    private static Map<String, Integer> contagemIngredientes = new HashMap<>();

    public void adicionaIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
        contabilizaIngrediente(ingrediente);
    }

    public double getPreco() {
        int numIngredientes = ingredientes.size();
        if (numIngredientes <= 2) {
            return 15.0;
        } else if (numIngredientes <= 5) {
            return 20.0;
        } else {
            return 23.0;
        }
    }

    private static void contabilizaIngrediente(String ingrediente) {
        int contagem = contagemIngredientes.getOrDefault(ingrediente, 0);
        contagemIngredientes.put(ingrediente, contagem + 1);
    }

    public static void imprimeQuantidadeDeCadaIngrediente() {
        for (Map.Entry<String, Integer> entry : contagemIngredientes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

class CarrinhoDeCompras {
    private List<Pizza> pizzas = new ArrayList<>();

    public void adicionaPizza(Pizza pizza) {
        if (pizza.getPreco() > 0) {
            pizzas.add(pizza);
        }
    }

    public double getValorTotal() {
        double total = 0;
        for (Pizza pizza : pizzas) {
            total += pizza.getPreco();
        }
        return total;
    }
}