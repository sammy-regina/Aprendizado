package records;//Para trabalhar com objetos imutáveis, é necessário usar o pacote records

public class Main {
    public static void main(String[] args) {
        Person person = new Person("José", 30);
        System.out.println(person);
        System.out.println("Nome: " + person.name() + ", Idade: " + person.age());
    }
}
