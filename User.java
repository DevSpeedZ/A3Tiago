public class User{
    private String nome;
    private String username;
    private String email;
    private String password;
    private float saldo;
    private int iD;
    private String nDeCelular;
    private boolean isActive;

    public User(String username, String password ){
        this.username = username;
        this.password = password;
    }



    public String getNome() {
        return nome;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return password;
    }

    public int getiD() {
        return iD;
    }

    public String getnDeCelular() {
        return nDeCelular;
    }

    public float getSaldo() {
        return saldo;
    }

    

}