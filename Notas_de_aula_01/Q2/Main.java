package Notas_de_aula_01.Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Matematica math = new Matematica();

        int escolha;

        System.out.print("Digite o primeiro valor: ");
        math.num1 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        math.num2 = sc.nextDouble();


        System.out.println("O Que você Deseja Fazer Com os Valores?");
        System.out.println("\n 1. Somar \n 2. Subtrair \n 3. Multiplicar \n 4. Dividir");
        escolha = sc.nextInt();


        switch (escolha) {
            case 1:
                System.out.println(math.num1 + " + " + math.num2 + " = " + math.somar());
                break;

            case 2:
                System.out.println(math.num1 + " - " + math.num2 + " = " + math.subtrair());
                break;

            case 3:
                System.out.println(math.num1 + " * " + math.num2 + " = " + math.multiplicacao());
                break;

            case 4:
                System.out.println(math.num1 + " / " + math.num2 + " = " + math.divisao());
                break;

            default:
                System.out.println("Opção Inválida!");
                break;

        }
    }
}