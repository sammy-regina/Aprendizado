package heranca_Polimorfismo;

public class Main {

    public static void main(String[] args) {
        Colaborador colaborador = new Colaborador();
        colaborador.setCode("001");
        colaborador.setNome("João");
        colaborador.setEndereco("Rua A, 123");
        colaborador.setIdade("30");
        colaborador.setSalario(3000.00);

        Gerente gerente = new Gerente();
        gerente.setCode("002");
        gerente.setNome("Maria");
        gerente.setEndereco("Rua B, 456");
        gerente.setIdade("35");
        gerente.setSalario(5000.00);
        gerente.setLogin("maria123");
        gerente.setSenha("senhaSegura");
        gerente.setComissao(1000.00);

        Vendedor vendedor = new Vendedor();
        vendedor.setCode("003");
        vendedor.setNome("Carlos");
        vendedor.setEndereco("Rua C, 789");
        vendedor.setIdade("28");
        vendedor.setSalario(2500.00);
        vendedor.setPorcentagemPorVenda(0.10);

        System.out.println("=================================================");
        System.out.println("Colaborador: " + colaborador.getNome());
        System.out.println("=================================================");
        System.out.println("Gerente: " + gerente.getNome() + ", Login: " + gerente.getLogin());
        System.out.println("=================================================");
        System.out.println("Vendedor: " + vendedor.getNome() + ", Porcentagem por Venda: " + vendedor.getPorcentagemPorVenda());
        System.out.println("=================================================");
    }
}
