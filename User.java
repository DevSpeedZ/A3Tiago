public class User{

    private String email;
    private String senhaHash;
    private double saldo;

    public User(String email, String password ){
        this.email = email;
        this.senhaHash = HashUtils.hashSenha(password);
        this.saldo = 1000.0;
    }

    public String getEmail() {
        return email;
    }

    public boolean validarSenha(String senhaDigitada) {
        String hashDigitado = HashUtils.hashSenha(senhaDigitada);
        return hashDigitado.equals(senhaHash);
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