package interfaces_funcionais;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
            new User("Alice", 30),
            new User("Bob", 25),
            new User("Charlie", 35)
        );
        /*Apresenta a lista completa*/
        users.forEach(System.out::println);

        /*Apresenta apenas os nomes*/
        //printStringValues(User::name, users);
    }
    private static void printStringValues(
        Function <User, String> callback, List<User> users) { // Function é uma interface funcional que recebe um parâmetro e retorna um valor e callback é o nome do parâmetro que representa a função que será passada como argumento
        users.forEach(
            user -> System.out.println(callback.apply(user))
        );
    }
}
