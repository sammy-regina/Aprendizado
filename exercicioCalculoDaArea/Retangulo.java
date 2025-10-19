package exercicioCalculoDaArea;

public record Retangulo(double base, double altura) implements FiguraGeometrica {
    @Override
    public double calcularArea() {
        // Área do retângulo = base * altura
        return base * altura;
    }
}
