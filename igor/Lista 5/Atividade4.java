import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ano;
        boolean bissexto;

        System.out.print("Entre com um ano: ");
        ano = entrada.nextInt();

        // Regra: é bissexto se (divisível por 400) ou (divisível por 4 e não divisível por 100)
        bissexto = (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);

        System.out.printf("%s\n", bissexto ? "É bissexto." : "Não é bissexto.");

        entrada.close();
    }
}