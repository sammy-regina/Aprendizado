package collection.src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <User> users = new ArrayList<>();
        var user = new User(1, "Alice"); // cria um novo objeto user
        users.add(user); // adiciona o objeto user na lista
        users.add(new User(2, "Bob"));
        users.add(new User(3, "Charlie"));
        System.out.println(users); // imprime a lista de usuarios
        System.out.println(users.remove(new User(8,"David"))); // tenta remover um objeto que nao existe e retorna false se existir retorna true
        System.out.println(users.remove(1)); // remove o objeto na posicao 1 e retorna o objeto removido
        System.out.println(users); // imprime a lista apos a remocao
        users.clear(); // limpa a lista
        System.out.println(users); // imprime a lista vazia
    }
}
