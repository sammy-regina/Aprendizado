package trabalhandoComSet.src;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        //Set<User> users = new HashSet<>(); // cria um set não ordenado
        //Set<User> users = new TreeSet<>(Comparator.comparingInt(User::getId)); // cria um set ordenado por id
        Set<User> users = new TreeSet<>(Comparator.comparingInt(User::getId).reversed()); // cria um set ordenado por id de forma decrescente
        users.add(new User(1, "Ana"));
        users.add(new User(2, "Bruno"));
        users.add(new User(3, "Juca"));
        users.add(new User(4, "Léo"));
        users.add(new User(2, "Bruno")); // não adiciona pois já existe um objeto com id 2 e name Bruno

        //System.out.println(new User(1, "Ana").hashCode()); // imprime o hashcode do objeto que é o numero gerado baseado no id e name

        //System.out.println(users.contains(new User(1, "Ana")));

        //users.forEach(System.out::println); // imprime todos os usuarios no set de forma aleatoria, pois o set não mantém a ordem de inserção

        //var iterator = users.iterator(); // cria um iterador para o set
        //while (iterator.hasNext()) { // enquanto tiver proximo elemento

        //    System.out.println(iterator.next()); // imprime o proximo elemento
        //}

        System.out.println(users); // imprime o set de usuarios ordenado por id

    }

}
