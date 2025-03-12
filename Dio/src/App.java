import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Olá " + nome + "!");
        System.out.println("E qual é sua idade?");
        int idade = sc.nextInt();
        System.out.println("Você tem " + idade + " anos!");
        sc.close();
    }
}
