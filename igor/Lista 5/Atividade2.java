import java.util.Scanner;
     
public class Atividade2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    double soma = 0.0; // 1 variavel (acumula as 4 notas)
    System.out.print("Digite as notas do aluno: ");
      soma += sc.nextDouble();  // nota 1
      soma += sc.nextDouble();  // nota 2
      soma += sc.nextDouble();  // nota 3
      soma += sc.nextDouble();  // nota 4

    System.out.print("Digite a presença do aluno: ");
    int presenca = sc.nextInt();  // 2 variavel (mostra a frequencia em %)

    // mostra a media do aluno se ele é aprovado/reprovado
    System.out.printf("Média : %.1f - %s%n",
      soma / 4.0,
      (soma / 4.0 >= 6.0 && presenca >= 75) ? "Aprovado" : "Reprovado");

      sc.close();

    }
  }