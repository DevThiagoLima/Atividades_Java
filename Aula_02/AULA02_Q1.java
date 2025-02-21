package Aula_02;

import java.util.Scanner;

public class AULA02_Q1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        String controle = "Sim";

        do {
            System.out.print("Informe seu nome: ");
            String nome = sc2.nextLine();

            System.out.print("Informe sua idade: ");
            int idade = sc.nextInt();

            System.out.println(nome);
            System.out.println(idade);

            System.out.print("Para repetir, digite Sim >> ");
            controle = sc.next();
        } while (controle.equalsIgnoreCase("Sim"));
    }
}
