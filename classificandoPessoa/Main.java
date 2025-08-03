package classificandoPessoa;

public class Main {
    public static void main(String[] args) {
        var masculino = new Pessoa();
        masculino.setName("João");
        masculino.setAge(30);

        var feminino = new Pessoa();
        feminino.setName("Maria");
        feminino.setAge(22);

        System.out.println("Nome: " + masculino.getName() + ", Idade: " + masculino.getAge());
        System.out.println("Nome: " + feminino.getName() + ", Idade: " + feminino.getAge());

    }
}
