import java.util.Scanner;

public class Atividade02 {
    /*
     * Faça um programa que receba duas notas, calcule e mostre
     * a média aritmética e a mensagem que se encontra
     * na tabela a seguir:
     * 0 < 3: Reprovado
     * 3 < 7: Exame
     * 7 <= 10: Aprovado
     */
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        double n1, n2, media;

        // Entrada de dados
        System.out.println("Informe a nota: ");
        n1 = entrada.nextDouble();
        System.out.println("Informe a nota: ");
        n2 = entrada.nextDouble();

        // Processamento de dados
        media = (n1 + n2) / 2;

        // Saída de dados
        if ((media >= 0) && (media < 3)) {
            System.out.println("Reprovado: " + media);
        } else if ((media >= 3) && (media < 7)) {
            System.out.println("Exame: ");
        } else if ((media >= 7) && (media <= 10)) {
            System.out.println("Aprovado: " + media);
        } else {
            System.out.println("Média inválida!");
        }

        entrada.close();
    }
}
