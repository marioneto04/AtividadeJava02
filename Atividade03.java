import java.util.Scanner;

public class Atividade03 {

    /*
     * Faça um programa que receba dois números e mostre o menor.
     */
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        double n1, n2;
        String msg;

        // Entrada de dados
        System.out.println("Informe um número: ");
        n1 = entrada.nextDouble();
        System.out.println("Informe um número: ");
        n2 = entrada.nextDouble();

        // Processamento de dados
        if (n1 > n2) {
           msg = n2 + " menor que " + n1;
        } else if (n1 < n2) {
           msg = n1 + " menor que " + n2;
        } else {
            msg = "São iguais!";
        }

        //Saída de dados
        System.out.println(msg);
        
        entrada.close();
    }
}
