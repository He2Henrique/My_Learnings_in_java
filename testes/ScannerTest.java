
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) throws Exception {
        String input = "jose (91)3333-3333 0987-654";
        Scanner sc = new Scanner(input);//second argument is the charset
        String nome = sc.next();
        String telefone = sc.next("[(][0-9]{2}[)]([0-9]{4}-[0-9]{4})");
        String celular = sc.next("[0-9]{4}-[0-9]{4}");
        
        System.out.println("Olá " + nome + "seu telefone é " + telefone + " e seu celular é " + celular);
        sc.close();
    }
}
