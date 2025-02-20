package Aula_01;/*
Faça um programa que calcule o salario de um funcionario com base no valor da hora trabalhada de R$ 15,00 e na
quantidade de 40 horas trabalhadas e exiba o salario.
 */


public class Main_Q1 {
    public static void main(String[] args) {

        double valorHora = 15;
        int quantHoras = 40;

        double salario;

        salario = valorHora * quantHoras;

        System.out.println("Seu salário esse mês foi de R$ " + salario);

    }
}

