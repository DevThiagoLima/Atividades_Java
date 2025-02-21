package Aula_02;

import java.util.Scanner;

public class Main_Exemplo1 {
    public static void main(String[] args) {

        int x = 1;
        int repetir;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Caso Escolha...");
            switch (x) {
                case 0:
                    System.out.println("Opção 0 escolhida!");
                    break;
                case 1:
                    System.out.println("Opção 1 escolhida!");
                    break;
                case 2:
                    System.out.println("Opção 2 escolhida!");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
            System.out.print("Para repetir, digite 0 >> ");
            repetir = sc.nextInt();

        } while (repetir == 0);
    }
}
