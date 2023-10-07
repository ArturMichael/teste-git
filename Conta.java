public class Conta {
    private String numeroConta;
    private String numeroAg;
    private String cliente;

    public Conta(String numeroConta, String numeroAg, String cliente){
        this.numeroConta = numeroConta;
        this.numeroAg = numeroAg;
        this.cliente = cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNumeroAg() {
        return numeroAg;
    }

    public String getCliente() {
        return cliente;
    }
}
