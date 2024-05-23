public class loginException extends  Exception{

    private String login;
    public loginException(String message) {
        super(message);
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
}
