import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade = 0;

        System.out.println("Escreva sua idade: ");
        idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("Não é maior de idade");

        }
}}