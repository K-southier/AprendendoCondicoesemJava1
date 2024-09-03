import java.util.Scanner;
public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota = 0;

        System.out.println("Digite a sua nota final");
        nota = sc.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota <7){
            System.out.println("Recuperação");
        } else if (nota < 5){
            System.out.println("reprovado");
        }
    }
}
