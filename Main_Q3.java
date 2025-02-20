/*
Elabore um programa que receba 3 notas (informadas pela pessoa desenvolvedora). Em seguida, calcule a média e verifique
se o aluno está aprovado, reprovado ou na final.

Obs: Aprovado >= 70, reprovado < 40;
 */

public class Main_Q3 {
    public static void main(String[] args) {

        double nota1 = 7.5;
        double nota2 = 4.7;
        double nota3 = 8.1;

        double media;

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7.0) {
            System.out.println("Você foi aprovado!!");
        } else if (media >= 4.0 && media < 7.0) {
            System.out.println("Você está na final!!");
        } else {
            System.out.println("Você foi reprovado!!");
        }


    }
}
