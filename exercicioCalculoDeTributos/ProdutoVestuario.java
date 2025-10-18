package exercicioCalculoDeTributos;

public class ProdutoVestuario implements ProdutoTributavel{
    private static final double ALIQUOTA = 0.025; // 2.5% de imposto para produtos alimentícios

    @Override
    public double calcularImposto(double valorBase) {
        return valorBase * ALIQUOTA;
    }

    @Override
    public String getTipo() {
        return "Vestuário (2.5%)";
    }

}
