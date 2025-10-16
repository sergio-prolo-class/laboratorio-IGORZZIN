import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada das 3 partes
        System.out.print("Entre com a primeira parte (1 dígito): ");
        int d1 = entrada.nextInt();

        System.out.print("Entre com a segunda parte (6 dígitos): ");
        int parte2 = entrada.nextInt();

        System.out.print("Entre com a terceira parte (5 dígitos): ");
        int parte3 = entrada.nextInt();

        // Quebra os dígitos manualmente (sem arrays)
        int d2 = parte2 / 100000;
        int d3 = (parte2 / 10000) % 10;
        int d4 = (parte2 / 1000) % 10;
        int d5 = (parte2 / 100) % 10;
        int d6 = (parte2 / 10) % 10;
        int d7 = parte2 % 10;

        int d8 = parte3 / 10000;
        int d9 = (parte3 / 1000) % 10;
        int d10 = (parte3 / 100) % 10;
        int d11 = (parte3 / 10) % 10;
        int d12 = parte3 % 10;

        // Soma dos dígitos nas posições ímpares (1,3,5,7,9,11)
        int soma1 = d1 + d3 + d5 + d7 + d9 + d11;

        // Soma dos dígitos nas posições pares (2,4,6,8,10,12)
        int soma2 = d2 + d4 + d6 + d8 + d10 + d12;

        // Cálculo do dígito verificador
        int total = soma1 + (soma2 * 3);
        int digitoVerificador = 10 - (total % 10);
        digitoVerificador = digitoVerificador % 10;

        // Saída formatada
        System.out.printf("Dígito verificador: %d%n", digitoVerificador);

        entrada.close();
    }
}
