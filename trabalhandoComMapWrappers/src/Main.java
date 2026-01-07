package trabalhandoComMapWrappers.src;

import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Map<String, User> users = new HashMap<>(); // Map é usado para armazenar pares chave-valor, ele é uma interface, por isso usamos HashMap que é uma implementação concreta de Map. ele é util quando queremos associar um valor a uma chave unica.
        users.put("joao@joao.com", new User("João", 25));
        users.put("maria@maria.com", new User("Maria", 30));
        users.put("lucas@lucas.com", new User("Lucas", 28));
        users.put("sandy@sandy.com", new User("Sandy", 22));

        //*----- testando valores verdadeiros e falsos -----*/
        //System.out.println(users.containsKey("marcos@marcos.com")); // false
        //System.out.println(users.containsValue(new User("Sandy", 22))); // true

        //*----- imprime a lista de valores completa-----*/
        //System.out.println(users);
        //System.out.println("---------------------");
        //users.keySet().forEach(System.out::println);
        //System.out.println("---------------------");
        //users.values().forEach(System.out::println);

        //*----- removendo um valor -----*/
        //users.remove("joao@joao.com", new User("João", 25));
        //*----- imprime a lista de valores sem joao -----*/
        //System.out.println(users);
        //System.out.println("---------------------");
        //users.keySet().forEach(System.out::println);
        //System.out.println("---------------------");
        //users.values().forEach(System.out::println);

        //*----- atualizando um valor -----*/
        users.forEach((k, y)-> System.out.printf("Chave: %s | Valor: %s \n", k, y));
        System.out.println("---------------------");
        users.replace("lucas@lucas.com", new User("Lucas Silva", 32));
        users.forEach((k, y) -> System.out.printf("Chave: %s | Valor: %s%n", k, y));

    }
}
