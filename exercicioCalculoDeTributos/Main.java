package exercicioCalculoDeTributos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // exemplo de diferentes prodttos com o mesmo valor base
        double valorBase = 100.0;

        // lista de produtos tributaveis
        List<ProdutoTributavel> produtos = Arrays.asList(
            new ProdutoAlimentacao(),
            new ProdutoSaude(),
            new ProdutoVestuario(),
            new ProdutoCultura()
        );

        System.out.println("--- Cálculo de Impostos para Produtos (Valor Base: R$ " + valorBase + ") ---");

        //usamos o metodo comum 'calcularImposto' para todos os produtos
        // o polimorfismo garante que o calculo correto (aliquota) seja aplicado
        for (ProdutoTributavel produto : produtos) {
            double imposto = produto.calcularImposto(valorBase);
            double total = valorBase + imposto;

            System.out.printf("Produto: %s\n", produto.getTipo());
            System.out.printf("  Imposto (Alíquota): R$ %.2f\n", imposto);
            System.out.printf("  Valor Final: R$ %.2f\n", total);
            System.out.println("----------------------------------------");
        }
    }
}
