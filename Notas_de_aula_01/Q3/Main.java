package Notas_de_aula_01.Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto();

        Scanner scNome = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        produto.nome = scNome.nextLine();

        System.out.print("Digite o preço unitário do produto: ");
        produto.preco = sc.nextDouble();

        System.out.print("Digite a quantidade inicial do estoque desse produto: ");
        produto.quantidade = sc.nextInt();


        String controle = "Sim";

        do {
            int escolha;

            System.out.println("O Que Você Deseja Fazer??");
            System.out.println(" \n 1. Adicionar +1 Ao Estoque \n 2. Vender Produtos \n 3. Exibir Quantidade em Estoque \n 4. Mostrar Valor Unitário do Produto");
            System.out.print(">> ");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    produto.adicionarEstoque();
                    break;

                case 2:
                    System.out.print("Quantas Unidades deseja comprar: ");
                    produto.quantCompra = sc.nextInt();
                    produto.venderProduto();
                    break;

                case 3:
                    produto.mostrarEstoque();
                    break;

                case 4:
                    produto.mostrarPreco();
                    break;
            }
            System.out.print("Deseja Continuar Fazendo Modificações? >> ");
            controle = sc.next();
        } while (controle.equalsIgnoreCase("Sim"));
    }
}
