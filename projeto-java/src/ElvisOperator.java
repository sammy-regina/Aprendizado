package org.example;

import java.util.Scanner;

public class ElvisOperator {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        var nome = scanner.nextLine();
        System.out.println("Informe a sua idade: ");
        var idade = scanner.nextInt();
        System.out.println("Você é emancipado? (Sim/Não) ");
        var emancipado = scanner.next().equalsIgnoreCase("Sim");

        var podeDirigir = idade >= 18 || (idade >= 16 && emancipado);
        var message = podeDirigir ?
                nome + ", você pode dirigir! \n" :
                nome + ", você não pode dirigir! \n";

        System.out.println(message);
        System.out.println("Obrigado por participar do nosso teste! \n");
    }
}
