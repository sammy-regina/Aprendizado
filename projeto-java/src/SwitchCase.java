package org.example;

public class SwitchCase {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        System.out.println("Informe um número de 1 a 7: ");
        var dia = scanner.nextInt();

        var message = switch (dia) {
            //case 1, 7 -> "Fim de semana!";
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sábado";
            default -> throw new IllegalArgumentException("Valor inválido: " + dia);
        };

        System.out.printf("O dia da semana é : %s ", message);
    }
}
