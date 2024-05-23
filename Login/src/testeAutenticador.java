import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class testeAutenticador {

    @Test
    public void loginComSucesso() throws loginException {
        Autenticador a = new Autenticador();
        Usuario u = a.logar("pessoa","senha");
        assertEquals("pessoa", u.getLogin());
    }

    @Test(expected = loginException.class)
    public void loginFalha() throws loginException{
        Autenticador a = new Autenticador();
        Usuario u = a.logar("pessoa","senhae");
    }

    @Test
    public void informacaoDoErro(){
        Autenticador a = new Autenticador();
        try {
            Usuario u = a.logar("pessoa","senhaa");
            fail();
        } catch (loginException e) {
            assertEquals("pessoa", e.getLogin());
        }
    }
}
