import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //numero de conta 4digitos,aencia 4 digitos text,nome do cliente, saldo
        

        Scanner sc = new Scanner(System.in, "UTF-8");//second argument is the charset


        int numeroConta;
        while(true){
            System.out.println("Digite o numero da conta: ");
            numeroConta = sc.nextInt();
            sc.nextLine();
            if(numeroConta < 1000 || numeroConta > 9999){
                System.out.println("Numero de conta invalido");
                continue;
            }
            break;
        }

        String numeroAgencia;
        while (true) {
            System.out.println("Digite o numero da agencia: ");
            numeroAgencia = sc.nextLine();
            
            if (!numeroAgencia.matches("\\d{4}")) {
                System.out.println("Número de agência inválido. Tente novamente.");
                continue;
            }
            break;
            
        }
        System.out.println("Digite o nome do cliente: ");
        String nome = sc.nextLine();
        
        double saldo;
        while (true) {
            try {
                System.out.println("Digite o saldo: ");
                saldo = sc.nextDouble();
                sc.nextLine();//limpar buffer
                break;
                
            } catch (Exception e) {
                System.out.println("Saldo inválido, digite o saldo com \",\".");
                sc.nextLine();
            }
        }
        
        System.out.println("Olá "+ nome  +", obrigado por criar uma conta em nosso banco, sua agência é "+ numeroAgencia +", conta "+ numeroConta +" e seu saldo "+ saldo +" já está disponível para saque");
        sc.close();

        
    }
}
