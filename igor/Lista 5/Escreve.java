import java.util.Scanner;

public class Escreve {
    public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite a temeratura em fahrenheit :");
      double fahrenheit = sc.nextDouble();
      double celsius = (fahrenheit - 32)* 5/9;
      System.out.print("Digite o valor da temperatura em Fahrenheit: " + celsius);


      sc.close();
}
}