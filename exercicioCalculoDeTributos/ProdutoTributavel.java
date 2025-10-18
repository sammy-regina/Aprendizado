package exercicioCalculoDeTributos;

public interface ProdutoTributavel {
    /**
     * Calcula e retorna o valor do imposto sobre o produto.
     * @param valorBase o valor original do produto (base de calculo)
     * @return o valor do imposto a ser pago.
     */
    double calcularImposto(double valorBase);

    /**
     * Retorna a descrição do tipo de produto.
     */

    String getTipo();
}
