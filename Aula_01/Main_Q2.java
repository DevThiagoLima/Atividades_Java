package Aula_01;/*
Elabore um programa que verifique se uma variavel é maior, menor ou igual a outra e exiba essa informação na tela
 */

public class Main_Q2 {
    public static void main(String[] args) {

        int var1 = 90;
        int var2 = 20;

        if (var1 > var2) {
            System.out.println("A Variavel 1 é maior!!");
        } else if (var1 == var2) {
            System.out.println("As duas variaveis são iguais!!");
        } else {
            System.out.println("A Variavel 2 é maior!!");
        }


    }
}
