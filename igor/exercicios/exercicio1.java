import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  

    double soma = 0;
    System.out.print( "Diga o valor 1: ");
    int valor1 = sc.nextInt();

    System.out.print( "Diga o valor 2: ");
    int valor2 = sc.nextInt();

    soma = valor1 + valor2;

    System.out.println(( "Valor da soma é: ") + soma);

    sc.close();
    }
}