package exercicioCalculoDeTributos;

public class ProdutoAlimentacao implements ProdutoTributavel{
    private static final double ALIQUOTA = 0.01; // 1% de imposto para produtos alimentícios

    @Override
    public double calcularImposto(double valorBase) {
        return valorBase * ALIQUOTA;
    }

    @Override
    public String getTipo() {
        return "Alimentação (1%)";
    }

}
