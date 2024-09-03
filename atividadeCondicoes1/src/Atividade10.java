import java.util.Scanner;
public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. Peça ao usuário para inserir o valor total da compra.
        //2. Aplique as seguintes regras de desconto progressivo:
        //    - Para compras acima de R$ 500,00: 20% de desconto.
        //    - Para compras entre R$ 200,00 e R$ 500,00: 10% de desconto.
        //    - Para compras entre R$ 100,00 e R$ 199,99: 5% de desconto.
        //    - Para compras abaixo de R$ 100,00: sem desconto.
        //3. Calcule o valor final após o desconto.
        //4. Informe o valor original, o percentual de desconto aplicado, o valor descontado e o valor final da compra

        double valorComDesconto = 0.0;
        double desconto = 0.0;
        double valorTotal = 0.0;
        double percentual = 0.0;

        System.out.println("Digita o valor total da compra ai: ");
        valorTotal = sc.nextDouble();

        if (valorTotal >500){
          percentual = 20;
        }
        else if (valorTotal >200 && valorTotal <500) {
            percentual = 10;
        } else if (valorTotal >100 && valorTotal <199.99){
            percentual = 5;
        }else{
            percentual = 0;
        }

        desconto = (percentual / 100) * valorTotal;
        valorComDesconto = valorTotal - desconto;

        System.out.println("O valor original é: " +valorTotal);
        System.out.println("O percentual de desconto é: " + percentual + "%" );
        System.out.println("o valor do desconto é: R$ " + desconto);
        System.out.println("O valor final da compra é de: R$ " + valorComDesconto);
    }

}
