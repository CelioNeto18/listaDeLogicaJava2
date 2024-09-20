//ifrn prof nickerson ferreira - lista de exercicios java basico 1 ao 6.

//1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e 
//mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. 
//(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
//

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite sua idade em anos: ");
        int anos = scanner.nextInt();

        System.out.println("Digite sua idade em meses: ");
        int meses = scanner.nextInt();

        System.out.println("Digite sua idade em dias: ");
        int dias = scanner.nextInt();

        int idadeDias = (anos*365 + meses*30 + dias);
        System.out.println("Sua idade em dias é: " + idadeDias);

        scanner.close();
                
    }
}