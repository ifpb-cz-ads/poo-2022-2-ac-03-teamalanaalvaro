
/**
 * Atividade do Livro Carvalho & Teixeira (2011): questão 1 da página 34.

 */
public class CTAtividade1
{
  public static void main(String[] args){
      int idade = Integer.parseInt(args[0]);
      if(idade < 16){
          System.out.println("Não pode votar");      
      }else if((idade >= 16 && idade < 18) || idade > 65){
          System.out.println("Votar é facultativo");
      }else{
          System.out.println("Votar é obrigatório!");
      }
  }
}
