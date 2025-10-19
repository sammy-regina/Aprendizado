package exercicioCalculoDaArea;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // instacias das diferentes figuras geometricas usando a sintaxe compacta do record
        FiguraGeometrica quadrado = new Quadrado(5.0);
        FiguraGeometrica retangulo = new Retangulo(10.0, 4.0);
        FiguraGeometrica circulo = new Circulo(3.0);

        // Armazenamos todas as figuras geometricas em um array de FiguraGeometrica
        List<FiguraGeometrica> figuras = Arrays.asList(quadrado, retangulo, circulo);

        System.out.println("--- Cálculo da Área das Figuras Geométricas ---");

        // Iteramos sobre a lista e chamamos o método comum 'calcularArea' para cada figura
        for (FiguraGeometrica figura : figuras){
            double area = figura.calcularArea();
            String nomeFigura = figura.getClass().getSimpleName();

            System.out.printf("Figura: %s\n", nomeFigura);

            // Usando o metodo toString() gerado automaticamente pelo record para exibir os detalhes da figura
            System.out.printf("Atributos: %s\n", figura.toString());
            System.out.printf("Área Calculada: %.2f\n", area);
            System.out.println("-------------------------------");
        }
    }
}
