public class Somador {
    String nome;
    int valorInstancia = 0;
     static int valorEstatica = 0;

     public void Somar (){
         valorInstancia++;
         valorEstatica++;
     }

     void Imprimir (){
         System.out.println("O somador "+nome+": instancia="+valorInstancia+" e estatica="+valorEstatica);
     }

}
