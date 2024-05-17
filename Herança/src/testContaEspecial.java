import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class testContaEspecial extends test{
    @Before
    public void inicializarConta(){
        cc = new ContaEspecial(100);
        cc.depositar(200);
    }

    @Test
    public void saqueMaiorQueSaldo(){
        int valorSacado = cc.sacar(350);
        assertEquals(cc.saldo, 200);
        assertEquals(valorSacado, 0);
    }

    @Test
    public void saqueMaiorQueSaldoDentroDoLimite(){
        int valorSacado = cc.sacar(250);
        assertEquals(cc.saldo, -50);
        assertEquals(valorSacado, 250);
    }
}
