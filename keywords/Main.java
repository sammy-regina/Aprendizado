package keywords;

import interfaces_funcionais.User;

public class Main {
    public static void main(String[] args) {
        var user = new Client(); // instancia de Client
        user.setName("John");
        System.out.println(user.getName());
        var address = new Address();
        address.setDescription("123 Main St");
        System.out.println(address.getDescription());
    }
}
