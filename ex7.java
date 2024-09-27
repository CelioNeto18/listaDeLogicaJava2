import java.util.Scanner;
import java.util.Arrays;

public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome do primeiro aluno: ");
        String alunoPrimeiro = new String();
        alunoPrimeiro = scan.nextLine();

        double[] primeiroAluno = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Informe a nota da disciplina " + (i + 1) + ":");
            primeiroAluno[i] = scan.nextDouble();
        }

        System.out.println("Aluno: " + alunoPrimeiro + "\nnotas: " + Arrays.toString(primeiroAluno));

        // falta a media e os outros alunos.
        scan.close();
    }
}
