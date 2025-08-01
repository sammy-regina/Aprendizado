import java.util.Scanner;

public class While_DoWhile {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var nome = "";

       /*
        while (true) {
            System.out.println("Digite seu nome: ");
            nome = scanner.nextLine();
            System.out.println(nome);

            if (nome.equalsIgnoreCase("sair")) {
                System.out.println("Saindo do loop...");
                break; // Encerra o loop se o usuário digitar "sair"
            }
        }*/

        do{
            System.out.println("Digite seu nome: ");
            nome = scanner.nextLine();
            System.out.println(nome);

            if (nome.equalsIgnoreCase("sair")) {
                System.out.println("Saindo do loop...");
                break; // Encerra o loop se o usuário digitar "sair"
            }
        } while (true);
    }
}
