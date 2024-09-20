//3. Informar um saldo e imprimir o saldo com reajuste de 1%.

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Infome seu salario: ");
        double salario = scanner.nextDouble();

        double reajuste = salario * 0.01;
        double novosalario = salario + reajuste;
        System.out.println("Seu salario com reajuste é: " + novosalario);

        scanner.close();
    }
}