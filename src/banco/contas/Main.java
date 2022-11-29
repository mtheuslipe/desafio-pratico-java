package banco.contas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
            System.out.println("Olá, deseja abrir uma conta? (true ou false): ");
            boolean criaConta = entrada.nextBoolean();
        do {
            if (criaConta == true) {
                novoClient();
                Scanner confirmation = new Scanner(System.in);
                System.out.println("Quer abrir outra conta? (true ou false): ");
                criaConta= confirmation.nextBoolean();
            } else System.out.println("Tchau!");

        } while (criaConta == true);
        listarContas();
    }
    public static void novoClient(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Qual teu nome?");
        String client = entrada.next();

        Cliente novoCliente = new Cliente();
        novoCliente.setNome(client);

        Conta cc= new ContaCorrente(novoCliente);
        Conta cp = new ContaPoupanca(novoCliente);

        Scanner entraValor= new Scanner(System.in);
        System.out.println("Deseja depositar quanto?");
        int valorDeposito = entraValor.nextInt();
        cc.depositar(valorDeposito);

        Scanner transfereValor= new Scanner(System.in);
        System.out.println("Deseja transferir quanto?");
        int valorTransferencia = transfereValor.nextInt();
        cc.transferir(cp, valorTransferencia);

        cc.imprimirComum();
        cp.imprimirComum();

    }
    public static void listarContas(){
        }
    }

