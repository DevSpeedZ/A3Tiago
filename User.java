public class User{
    private String nome;
    private String username;
    private String email;
    private String password;
    private float saldo;
    private int iD;
    private String nDeCelular;
    public boolean isActive;

    public User(String email, String password ){
        this.email = email;
        this.password = password;
        isActive = false;
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