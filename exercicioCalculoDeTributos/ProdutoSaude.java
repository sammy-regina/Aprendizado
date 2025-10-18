package exercicioCalculoDeTributos;

public class ProdutoSaude implements ProdutoTributavel{
    private static final double ALIQUOTA = 0.015; // 1.5% de imposto para produtos alimentícios

    @Override
    public double calcularImposto(double valorBase) {
        return valorBase * ALIQUOTA;
    }

    @Override
    public String getTipo() {
        return "Saúde e Bem Estar (1.5%)";
    }

}
