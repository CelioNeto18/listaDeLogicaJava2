import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma operação: 1=adição 2=subtração 3=multiplicação 4=divisão");
        int operacao = scanner.nextInt();

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        if (operacao == 1) {
            // Adição
            double resultado = num1 + num2;
            System.out.println("Resultado da adição: " + resultado);
        } else if (operacao == 2) {
            // Subtração
            double resultado = num1 - num2;
            System.out.println("Resultado da subtração: " + resultado);
        } else if (operacao == 3) {
            // Multiplicação
            double resultado = num1 * num2;
            System.out.println("Resultado da multiplicação: " + resultado);
        } else if (operacao == 4) {
            // Divisão
            if (num2 != 0) {
                double resultado = num1 / num2;
                System.out.println("Resultado da divisão: " + resultado);
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
