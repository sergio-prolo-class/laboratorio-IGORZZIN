import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        // Pede para o usuario digitar os lados do triangulo e atribuir eles para as variavel a,b e c
        System.out.print("Digite os lados do triângulo: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
        
        if ( a == b &&  b == c) {
            System.out.println("Triângulo equilátero");
        }
        else if (a == b || b == c || a == c) {
            System.out.println("Triângulo isósceles");
        }
        else {
            System.out.println("Triângulo escaleno");
        }
        } else {
        System.out.println("Triângulo invalido");
    }
    sc.close();
    }
}