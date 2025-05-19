public class User{

    private String email;
    private String password;
    private double saldo;
    private int iD;

    public User(String email, String password ){
        this.email = email;
        this.password = password;
        this.saldo = 0.0;
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

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    

}