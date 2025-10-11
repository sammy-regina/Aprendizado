package estruturaDeControleValidacao;

import java.util.Scanner;

public class VerificadorCamposObrigatorios {
    /*
    Desafio
Você está testando um sistema bancário que realiza cadastros de clientes. Como parte do time de QA, precisa criar uma rotina que verifique se os campos obrigatórios foram preenchidos.

Entrada
Três valores do tipo String, representando: nome, cpf e email. Os campos podem ser vazios ("").

Saída
Se algum campo estiver vazio, deve retornar:

Desafio
Você está testando um sistema bancário que realiza cadastros de clientes. Como parte do time de QA, precisa criar uma rotina que verifique se os campos obrigatórios foram preenchidos.

Entrada
Três valores do tipo String, representando: nome, cpf e email. Os campos podem ser vazios ("").

Saída
Se algum campo estiver vazio, deve retornar:

Cadastro incompleto
Se todos estiverem preenchidos, deve retornar:

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //TODO: Crie a estrutura condicional para verificar se algum dos campos está vazio:
        String nome = sc.nextLine();
        String cpf = sc.nextLine();
        String email = sc.nextLine();

        if (nome.isEmpty() || cpf.isEmpty() || email.isEmpty()) {
            System.out.println("Cadastro incompleto");
        } else {
            System.out.println("Cadastro validado com sucesso");
        }
        sc.close();
    }
}
