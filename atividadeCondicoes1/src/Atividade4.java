import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //verificação de login
        //criar uma variavel que receba usuario e senha

        String usuario = "alunoUnipar";
        String senha = "1234";

        System.out.println("Digite o nome do usuário");
        usuario = sc.next();

        System.out.println("Digite a senha do usuário *somente números");
        senha = sc.next();

        if (usuario == "alunoUnipar" && senha == "1234"){
            System.out.println("Login realizado com sucesso!");
        }
        else {
            System.out.println("usuario ou senha incorreto");
        }

    }}