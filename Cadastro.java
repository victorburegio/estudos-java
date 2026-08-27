import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Nome Completo:");
        String Nome = ler.nextLine();

        System.out.print("Cidade:");
        String Cidade = ler.nextLine();

        System.out.print("Ano do nascimento:");
        int Ano = ler.nextInt();

        System.out.println("-----Ficha-----");
        System.out.printf("Nome completo:%s %nCidade:%s %nAno do nascimento:%d", Nome, Cidade, Ano);

        ler.close();
    }
}
