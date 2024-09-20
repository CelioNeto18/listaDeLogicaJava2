//Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
//calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
//(1SM=R$788,00)

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu salario: ");
        double salario = scanner.nextDouble();

        double salarioMinimo = 788.00;
        double salarioMinimodoSalario = salario / salarioMinimo;

        System.out.printf("Voce ganha essa quantidade de salarios minimos: %.2f", salarioMinimodoSalario);

        scanner.close();
    }
}