package classificandoPessoa;

public class Main {
    public static void main(String[] args) {
        var masculino = new Pessoa();
        masculino.name = "João";
        masculino.age = 30;

        var feminino = new Pessoa();
        feminino.name = "Maria";
        feminino.age = 22;

        System.out.println("Nome: " + masculino.getName() + ", Idade: " + masculino.getAge());
        System.out.println("Nome: " + feminino.getName() + ", Idade: " + feminino.getAge());

    }
}
