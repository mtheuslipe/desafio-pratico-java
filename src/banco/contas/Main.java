package banco.contas;

public class Main {
    public static void main(String[] args) {

        Cliente matheus = new Cliente();
        matheus.setNome("Matheus");

        Conta cc= new ContaCorrente(matheus);
        Conta cp= new ContaPoupanca(matheus);

        cc.depositar(100);
        cc.transferir(cp,50);

        cc.imprimirComum();
        cp.imprimirComum();
    }
}
