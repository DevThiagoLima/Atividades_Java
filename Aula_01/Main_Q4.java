package Aula_01;/*
Faça um programa para o calculo de uma folha de pagamento. Para isso, o sistema deve saber o valor do salario.
Com base na descrição abaixo, exbia o texto dos descontos do IR:

- Salario até R$ 900,00 (inclusive ou ==) - Isento;
- Salario de R$900,01 até R$ 1.500,00 (inclusive ou ==) - desconto de 5%;
- Salario de R$ 1.500,01 até R$ 2.500,00 (inclusive ou ==) - desconto de 10%;
- Salario acima de R$ 2.500 (inclusive ou ==) - desconto de 20%;

System.out.println("Seu salario foi de R$" + salario);
 */

public class Main_Q4 {
    public static void main(String[] args) {

    double salario = 2288.00;

    double desconto5 = (salario / 100) * 5;
    double desconto10 = (salario / 100) * 10;
    double desconto20 = (salario / 100) * 20;

    if (salario <= 900.00) {
        System.out.println("Seu salario foi de R$" + salario);
        System.out.println("Você Está Isento de Imposto de Renda :D");
    } else if (salario > 900.00 &&  salario <= 1500.00) {
        System.out.println("Seu salario foi de R$" + salario);
        System.out.println("Seu Imposto de Renda Foi de 5%, ou seja, R$" + desconto5);
        System.out.println("Você Irá Receber R$ " + (salario - desconto5));
    } else if (salario > 1500.00 && salario <= 2500.00) {
        System.out.println("Seu salario foi de R$" + salario);
        System.out.println("Seu Imposto de Renda Foi de 10%, ou seja, R$ " + desconto10);
        System.out.println("Você Irá Receber R$ " + (salario - desconto10));
    } else {
        System.out.println("Seu salario foi de R$" + salario);
        System.out.println("Seu Imposto de Renda Foi de 20%, ou seja, R$ " + desconto20);
        System.out.println("Você Irá Receber R$ " + (salario - desconto20));
    }


    }
}
