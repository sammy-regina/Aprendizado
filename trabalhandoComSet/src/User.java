package trabalhandoComSet.src;

import static java.util.Objects.hash;

public class User {

    private  int id;

    private String name;

    public User(String ana) {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("{'id': %s, 'name': '%s'}", id, name); //
    }

    @Override
    public boolean equals(final Object obj){ // equals verifica se dois objetos são iguais
        if (this == obj) return true; // se for o mesmo objeto retorna true
        if (obj == null || getClass() != obj.getClass()) return false; // se for null ou de classes diferentes retorna false

        final User user = (User) obj; // faz o cast do obj para User e atribui a variavel user

        if (id != user.id) return false; // compara o id e se for diferente retorna false
        return name != null ? name.equals(user.name) : user.name == null; // compara o name se não for null
    }

    @Override
    public int hashCode() { // o hashCode gera um numero unico para cada objeto baseado nos atributos
        return hash(this.id, this.name); // gera um hashcode baseado no id e name
    }
}
