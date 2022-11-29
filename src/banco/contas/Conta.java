package banco.contas;

public abstract class Conta implements iConta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    private static int AGENCIA_PADRAO= 001;
    private static int SEQUENCIAL = 1;
    public Conta(Cliente cliente){
        this.agencia=AGENCIA_PADRAO;
        this.numero= SEQUENCIAL++;
        this.cliente= cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    @Override
    public void sacar(double valor) {
        saldo-=valor;

    }

    @Override
    public void depositar(double valor) {
        saldo+=valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    protected void imprimirComum() {

        System.out.println(String.format("Cliente %s", this.cliente.getNome()));
        System.out.println(String.format("Agência %d", this.agencia));
        System.out.println(String.format("Número %d", this.numero));
        System.out.println(String.format("Saldo %f", this.saldo));
    }

    protected void imprimirTudo(){
        for (int i = 0; i<=this.getNumero(); i++){
            imprimirComum();
        }
    }
}
