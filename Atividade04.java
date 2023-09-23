import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        double n1, n2, n3;

        // Entrada de dados
        System.out.println("Informe um número: ");
        n1 = entrada.nextDouble();
        System.out.println("Informe um número: ");
        n2 = entrada.nextDouble();
        System.out.println("Informe um número: ");
        n3 = entrada.nextDouble();

        // Processamento de dados
        if ((n1 >= n2) && (n1 >= n3)) {
            System.out.println(n1 + " é o maior!");
        } else if ((n2 >= n1) && (n2 >= n3)) {
            System.out.println(n2 + " é o maior!");
        } else if ((n3 >= n1) && (n3 >= n2)) {
            System.out.println(n3 + " é o maior!");
        }
        entrada.close();
    }
}
