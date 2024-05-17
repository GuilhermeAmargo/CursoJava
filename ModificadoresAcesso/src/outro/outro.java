package outro;

import pacote.Referencia;

public class outro {

    Referencia r = new Referencia();
    public void testeAcesso(){
        r.modificadorDefault = 0;
        r.modificadorPublico = 0;
        r.modificadorProtegido = 0;
        r.modificadorPrivado = 0;
    }
}
