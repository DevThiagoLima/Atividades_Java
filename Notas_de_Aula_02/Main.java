package Notas_de_Aula_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Produto p = new Produto();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);


        System.out.println("Informe O Nome Do Produto: ");
        p.setNome(sc2.nextLine());

        System.out.println("Informe O Código Do Produto: ");
        p.setCodigo(sc.nextInt());

        System.out.println("Informe O Tamanho Do Produto: ");
        p.setTamanho(sc.nextDouble());

        System.out.println("Informe O Peso Do Produto: ");
        p.setPeso(sc.nextDouble());

        System.out.println("Informe A Cor Do Produto: ");
        p.setCor(sc2.nextLine());

        System.out.println("Informe O Valor Do Produto: ");
        p.setValor(sc.nextDouble());

        System.out.printf("Informe A Quantidade Inicial Do Estoque: ");
        p.setQuantidadeEstoque(sc.nextInt());

        String controle = "Sim";

        do {
            int escolha;

            System.out.println("O Que Você Deseja Fazer??");
            System.out.println(" \n 1. Realizar Venda \n 2. Controlar Estoque \n 3. Sair");
            System.out.print(">> ");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Quantas Unidades Deseja Comprar?? >> ");
                    p.setQuantidadeCompra(sc.nextInt());

                    System.out.println("Qual a Forma de Pagamento??");
                    System.out.println("1. Pix // Débito // Dinheiro \n2. Crédito");
                    int pagamento = sc.nextInt();

                    if (pagamento == 1) {
                        p.realizarVendaAVista();
                    } else if (pagamento == 2) {
                        p.realizarVendaNoCredito();
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;

                case 2:
                    System.out.println("Estoque Atual: " + p.getQuantidadeEstoque());
                    break;

                case 3:
                    controle = "Não";
                    break;

                default:
                    System.out.println("Opção Inválida!");
            }
        } while (controle.equalsIgnoreCase("Sim"));
    }
}
