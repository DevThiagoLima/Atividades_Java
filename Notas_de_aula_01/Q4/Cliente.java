package Notas_de_aula_01.Q4;

public class Cliente {

    String nome;
    double saldo, deposito, saque, transferencia;


    public void consultarSaldo() {
        System.out.println("Seu Saldo Atual É: R$ " + saldo);
    }

    public void depositar() {
        saldo = saldo + deposito;
        System.out.println("Deposito Realizado Com Sucesso!");
        System.out.println("Seu Saldo Atual Agora É: R$ " + saldo);
    }

    public void sacar() {
        saldo = saldo - saque;
        System.out.println("Saque Realizado Com Sucesso!");
        System.out.println("Seu Saldo Atual Agora É: R$ " + saldo);
    }

    public void transferir() {
        saldo = saldo - transferencia;
        System.out.println("Tranferência Realizada Com Sucesso!");
        System.out.println("Seu Saldo Atual Agora É: R$ " + saldo);
    }
}