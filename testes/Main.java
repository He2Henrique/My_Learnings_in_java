public class Main{
//o public serve para que a classe ou o metodo seja acessado por qualquer parte do codigo.
  
    public void recebendo_args_prompt(String[] args) {
        System.out.println("programa tem isso de argumentos:" + args.length);

        for(int i = 0; i < args.length; i++){
            System.out.println("argumento " + (i + 1) + ": " + args[i]);
        }
        //comentario
    }
    public static void main(String[] args) {
    // metodo main é por onde o programa sera executado ele é o caminho principal que o program ira tomar.
    //exibir mensagens, realizar cálculos, chamar métodos, etc.
        Pessoa cara = new Pessoa();
        
        cara.nome = "João";
        cara.idade = 17;
        cara.maior();
        
    }
}