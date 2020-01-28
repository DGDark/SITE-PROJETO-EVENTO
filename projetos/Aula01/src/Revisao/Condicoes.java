package Revisao;

public class Condicoes {
    public static void main(String[] args) {
       float nota1 =7.0f;
       float nota2 = 8.7f;
       double media = (nota1 + nota2)/2;
       String nomeAluno = ("Davi ");

       if(media>=7.0){
           System.out.println("Aprovado ");
       }
       else if (media > 5.0 && media < 8.0){
           System.out.println("Recuperação ");
        }
       else{
           System.out.print("Reprovado ");
        }
       System.out.println(nomeAluno.toUpperCase()  + "Vocẽ tirou a media: " + media);
    }
}
