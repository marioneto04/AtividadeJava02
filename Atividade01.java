import java.util.Scanner;

public class Atividade01 {
    /*
     * Faça um programa que receba quatro notas de um aluno,
     * calcule e mostre a média aritmética das notas e a
     * mensagem de aprovado ou reprovado, considerando para
     * aprovação média 7.
     */

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        double n1, n2, n3, n4, media;

        // Entrada de dados
        System.out.println("Informe a nota: ");
        n1 = entrada.nextDouble();
        System.out.println("Informe a nota: ");
        n2 = entrada.nextDouble();
        System.out.println("Informe a nota: ");
        n3 = entrada.nextDouble();
        System.out.println("Informe a nota: ");
        n4 = entrada.nextDouble();

        // Processamento de dados
        media = (n1 + n2 + n3 + n4) / 4;

        // Saída de dados
        if (media >= 7) {
            System.out.println("Aprovado: " + media);
        } else {
            System.out.println("Reprovado: " + media);
        }

        entrada.close();
    }
}