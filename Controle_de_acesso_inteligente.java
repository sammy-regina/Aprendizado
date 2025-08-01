import java.util.Scanner;

public class Controle_de_acesso_inteligente {
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados do usuário
        System.out.println("Você tem permissão? (true/false): ");
        boolean temPermissao = scanner.nextBoolean(); // Lê um valor booleano (true ou false)
        System.out.println("Informe a sua idade: ");
        var idade = scanner.nextInt();

        // TODO: Verifique condições de acesso
        if (idade >= 18 && temPermissao == true) {
            System.out.printf("Acesso permitido \n");
        } else if (idade <= 16 && temPermissao == true) {
            System.out.printf("Idade insuficiente \n");
        }
        else {
            System.out.printf("Acesso negado\n");
        }
        System.out.println("Obrigado por participar do nosso teste! \n");

        scanner.close();
    }*/

    //esse nã funcionou
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados do usuário
        boolean hasPermission = scanner.nextBoolean(); // Lê um valor booleano (true ou false)
        int age = scanner.nextInt(); // Lê a idade como inteiro

        // TODO: Verifique condições de acesso
        if (hasPermission) {
            if (age >= 18) {
                System.out.println("Acesso permitido");
            } else {
                System.out.println("Idade insuficiente");
            }
        } else {
            System.out.println("Acesso negado");
        }

        scanner.close();
    }
}
