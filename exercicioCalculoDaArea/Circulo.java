package exercicioCalculoDaArea;

public record Circulo(double raio) implements FiguraGeometrica {
    @Override
    public double calcularArea() {
        // Área do círculo = π * raio^2
        // Usando Math.PI para o valor de π
        return Math.PI * raio * raio;
    }
}
