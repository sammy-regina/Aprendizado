package exercicioCalculoDeTributos;

public class ProdutoCultura implements ProdutoTributavel{
    private static final double ALIQUOTA = 0.04; // 4% de imposto para produtos alimentícios

    @Override
    public double calcularImposto(double valorBase) {
        return valorBase * ALIQUOTA;
    }

    @Override
    public String getTipo() {
        return "Cultura (4%)";
    }

}
