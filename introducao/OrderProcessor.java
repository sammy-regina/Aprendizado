package introducao;

import java.util.Scanner;

public class OrderProcessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos valores
        double itemsValue = scanner.nextDouble();
        double shipping = scanner.nextDouble();
        boolean firstPurchase = scanner.nextBoolean();

        // Inicialização do desconto
        double discount = 0.0;

        // Aplicar desconto se for a primeira compra
        if (firstPurchase) {
            discount = itemsValue * 0.05; // 5% de desconto
        }

        // Aplicar frete grátis se o valor dos itens for maior ou igual a 200
        if (itemsValue >= 200.0) {
            shipping = 0.0;
        }

        // Calcular o valor final
        double discountedValue = itemsValue - discount;
        double finalValue = discountedValue + shipping;

        // Exibir o valor final com duas casas decimais
        System.out.printf("%.2f%n", finalValue);

        // Fechar o scanner
        scanner.close();
    }
}