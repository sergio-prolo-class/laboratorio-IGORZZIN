import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor; // variável 1
        int q;     // variável 2 

        System.out.print("Entre com a quantidade de centavos: ");
        valor = entrada.nextInt();

        q = valor / 50;
        System.out.printf("Moedas de 50 centavos: %d\n", q);
        valor = valor % 50;

        q = valor / 25;
        System.out.printf("Moedas de 25 centavos: %d\n", q);
        valor = valor % 25;

        q = valor / 10;
        System.out.printf("Moedas de 10 centavos: %d\n", q);
        valor = valor % 10;

        q = valor / 5;
        System.out.printf("Moedas de 05 centavos: %d\n", q);
        valor = valor % 5;

        q = valor / 1;
        System.out.printf("Moedas de 01 centavo: %d\n", q);
        valor = valor % 1;

        entrada.close();
    }
}