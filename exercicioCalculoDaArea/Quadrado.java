package exercicioCalculoDaArea;

public record Quadrado(double lado) implements FiguraGeometrica {
    @Override
    public double calcularArea() {
        // Área do quadrado = lado * lado
        return lado * lado;
    }
}
