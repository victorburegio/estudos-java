import java.util.Scanner;

public class Sistemadelogin{
    public static void main(String[] args){

        Scanner ler = new Scanner (System.in);

        System.out.println("Login:");
        String login = ler.nextLine().trim();

        System.out.println("Senha:");
        String senha = ler.nextLine().trim();

        String Login = "admin";
        String Senha = "unicap2026";

        System.out.printf("Usuario: %s%n", login);
        System.out.printf("senha: %s%n", senha);

    if (login.equalsIgnoreCase(Login) && senha.equals(Senha)){
        System.out.println("Acesso liberado, Bem vindo, Admin!");
    }
    else {
        System.out.println("Acesso negado");
    }
    }   
    } 
