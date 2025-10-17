
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    // constantes 
    double salario = 2000.00;
    double comissao = 0.0;
    double bonus = 0.0;

    System.out.print( "Diga o total das vendas (R$): " );
    double vendas = entrada.nextInt();

    System.out.print( "Diga a avaliação do desempenho (1-10): ");
    int avaliaçao = entrada.nextInt();

    if (vendas >= 10000) 
        {comissao = vendas * 0.07;}
      else { comissao = vendas * 0.05;}

     // Verifica se tem bônus
        if (avaliaçao >= 8) 
            {bonus = 500.00;}
        

        // Remuneração total
        double total = salario + comissao + bonus;

        // Saída formatada
        System.out.println("Remuneração: R$ " + String.format("%.2f", total));

        entrada.close();
    }
}