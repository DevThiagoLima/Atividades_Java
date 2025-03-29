package Notas_de_aula_01.Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Scanner scNome = new Scanner(System.in);

        Aluno A = new Aluno();


        System.out.print("Digite o seu nome: ");
        A.nome = scNome.nextLine();

        System.out.print("Digite sua primeira nota: ");
        A.nota1 = sc.nextDouble();

        System.out.print("Digite sua segunda nota: ");
        A.nota2 = sc.nextDouble();

        System.out.print("Digite sua terceira nota: ");
        A.nota3 = sc.nextDouble();

        System.out.println("Olá " + A.nome);
        System.out.println("Sua média foi de: " + A.calcularMedia());


        if (A.media >= 7) {
            System.out.println("Você foi aprovado!!");
        } else if (A.media < 4) {
            System.out.println("Você foi reprovado!!");
        } else {
            System.out.println("Você está na final!!");
        }
    }
}
