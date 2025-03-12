public class Pessoa {
    String nome;
    int idade;

    //todos os metodos saguem a seguinte convenção 
    //[modificadores] [tipo de retorno] [nome do metodo] (parametros)
    public void maior(){
        if(idade >= 18) {
            System.out.println(nome + " é maior de idade");
        }else{
            System.out.println(nome + " é menor de idade");
        }
        
    }
}
