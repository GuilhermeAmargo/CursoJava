public class Autenticador {
    public Usuario logar(String login, String senha) throws loginException{
        if(login.equals("pessoa") && senha.equals("senha")){
            return new Usuario(login);
        }
        throw new loginException("O usuario e a senha não batem! "+ login);
    }
}
