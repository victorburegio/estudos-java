import java.util.Scanner;
    
    public class Medianotas {
    public static void main(String[] args){
        Scanner ler=new Scanner(System.in);
        System.out.print("nome do aluno:");
        String nome = ler.nextLine();
        System.out.print("nota 1:");
        double nota = ler.nextDouble();
        System.out.print("nota 2:");
        double nota2 = ler.nextDouble();
        System.out.print("nota 3:");
        double nota3 = ler.nextDouble();   
        double media = (nota + nota2 + nota3) / 3;
        System.out.printf("Aluno:%s %nMedia:%.2f%n", nome, media);
    if (media >= 7.0){
         System.out.printf ("Situação: Aprovado"); }
    else {
        System.out.printf("Situação: Reprovado"); }
    }
}
