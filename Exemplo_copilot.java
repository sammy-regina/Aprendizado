public class Exemplo_copilot {
    // Crie uma constante chamada "produtos" contendo uma lista de objetos json.
    // Cada objeto deve representar um produto com as seguintes propriedades:
    //id, nome,preco, descrição e categoria.
    // A lista deve conter pelo menos 3 produtos diferentes.
    public static void main(String[] args) {
        String produtos = "[{\"id\": 1, \"nome\": \"Produto A\", \"preco\": 10.99, \"descricao\": \"Descrição do Produto A\", \"categoria\": \"Categoria 1\"},"
                + "{\"id\": 2, \"nome\": \"Produto B\", \"preco\": 20.49, \"descricao\": \"Descrição do Produto B\", \"categoria\": \"Categoria 2\"},"
                + "{\"id\": 3, \"nome\": \"Produto C\", \"preco\": 15.75, \"descricao\": \"Descrição do Produto C\", \"categoria\": \"Categoria 1\"}]";

        System.out.println(produtos);
    }
}
