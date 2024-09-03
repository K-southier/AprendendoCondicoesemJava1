import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota = 0;

        System.out.println("Digite sua nota: ");
        nota = sc.nextDouble();

        if (nota >9) {
            System.out.println("Excelente");
        } else if (nota >7) {
            System.out.println("Bom");
        } else if (nota >= 5) {
            System.out.println("Satisfátorio");
        } else if (nota < 5) {
            System.out.println("Insatisfatório");
 }
}}