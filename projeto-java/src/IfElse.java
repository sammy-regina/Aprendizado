package org.example;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        var nome = scanner.nextLine();
        System.out.println("Informe a sua idade: ");
        var idade = scanner.nextInt();
        System.out.println("Você é emancipado? (Sim/Não) ");
        var emancipado = scanner.next().equalsIgnoreCase("Sim");


        if (idade >= 18) {
            System.out.printf("Olá %s, você é tem %s anos de idade, e pode dirigir! \n", nome, idade);
        } else if (idade >= 16 && emancipado) {
            System.out.printf("Olá %s, você tem %s anos e é menor de idade, mas é emancipado então pode dirigir! \n", nome, idade);
        }
        else {
            System.out.printf("Olá %s, você é menor de idade \n", nome);
            System.out.println("Você não pode dirigir! \n");
        }
        System.out.println("Obrigado por participar do nosso teste! \n");

    }

}
