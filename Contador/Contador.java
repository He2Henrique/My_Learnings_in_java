
import java.util.Scanner;
import com.exeptions.ParametrosInvalidosException;
import java.util.InputMismatchException;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in); // Criação do Scanner
        try {
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = terminal.nextInt(); 
            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = terminal.nextInt(); 

            
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            // Imprimir a mensagem de erro
            System.out.println("Erro: " + exception.getMessage());
        } catch (InputMismatchException e) {
            // Tratamento para entradas inválidas (não numéricas)
            System.out.println("Erro: Por favor, insira apenas números inteiros.");
        } finally {
            terminal.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i <= contagem; i++) {
            System.out.println(parametroUm + i);
        }
    }
}