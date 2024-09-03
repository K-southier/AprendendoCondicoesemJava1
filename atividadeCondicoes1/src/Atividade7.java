import java.util.Scanner;
public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //calculadora simples
        //inserir dois números e uma operação
        //com base na operação realizar o calculo e imprimir para o usuário

        Double num1 = 0.0;
        Double num2 = 0.0;
        Double resultado = 0.0;

        System.out.println("digite o primeiro número");
        num1 = sc.nextDouble();
        System.out.println("digite a operação");
        char op = sc.next().charAt(0);
        System.out.println("digite o segundo número");
        num2 = sc.nextDouble();

        switch (op) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            default:
                System.out.println("erro");
                break;
        }
        System.out.println("o resultado é: " + resultado);


    }
}
