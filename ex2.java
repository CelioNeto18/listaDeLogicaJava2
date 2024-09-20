//. Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos 
//números 4, 5 e 6. A soma das duas médias. A média das médias.

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 8;
        int num2 = 9;
        int num3 = 7;

        int soma1 = (num1 + num2 + num3);
        double media1 = (num1 + num2 + num3) / 3.0;

        System.out.println("A media do grupo um é: " + media1);

        int num4 = 4;
        int num5 = 5;
        int num6 = 6;

        int soma2 = (num4 + num5 + num6);
        double media2 = (num4 + num5 + num6) / 3.0;

        System.out.println("A media do grupo dois é: " + media2);

        double media3 = (media1 + media2) / 2.0;

        System.out.println("A media do grupo um com o grupo dois é: " + media3);

        scanner.close();
    }
}
