package org.example;

public class For {
    public static void main(String[] args) {

        /*
        for (var i = 1; i <= 20; i ++){
            if (i == 21) break;

            System.out.println("Número: " + i);
        }*/

        /*
        var scanner = new java.util.Scanner(System.in);

        for (;;) {
            System.out.println("Digite um nome: ");
            var nome = scanner.nextLine();

            if (nome.equals("sair")) {
                System.out.println("Saindo do loop.");
                break;
            }
        }*/

        for (var i = 1; i <= 20; i ++) {
            if (i % 2 == 0){
                continue;
            }

            System.out.println("Número: " + i);
        }
    }
}
