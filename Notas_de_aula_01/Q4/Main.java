package Notas_de_aula_01.Q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        Cliente c = new Cliente();

        System.out.print("Informe Seu Nome: ");
        c.nome = sc2.nextLine();

        System.out.print("Informe o Saldo Inicial da Conta: ");
        c.saldo = sc.nextDouble();

        String controle = "Sim";

        do {
            int escolha;

            System.out.println("O Que Você Deseja Fazer??");
            System.out.println(" \n 1. Consultar Saldo \n 2. Depositar \n 3. Sacar \n 4. Transferir");
            System.out.print(">> ");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    c.consultarSaldo();
                    break;

                case 2:
                    System.out.print("Informe o valor do Deposito: R$ ");
                    c.deposito = sc.nextDouble();
                    c.depositar();
                    break;

                case 3:
                    System.out.print("Informe o valor do Saque: R$ ");
                    c.saque = sc.nextDouble();
                    c.sacar();
                    break;

                case 4:
                    System.out.print("Informe o valor da Transferencia: R$ ");
                    c.transferencia = sc.nextDouble();
                    c.transferir();
                    break;
            }
            System.out.print("Deseja Continuar Fazendo Modificações? >> ");
            controle = sc.next();
        } while (controle.equalsIgnoreCase("Sim"));

    }
}
