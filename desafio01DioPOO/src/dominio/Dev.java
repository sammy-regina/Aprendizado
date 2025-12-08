package desafio01DioPOO.src.dominio;

import java.util.Objects;
import java.util.Set;
import java.util.Optional;

public class Dev {
    private String nome;
    private java.util.Set<Conteudo> conteudosInscritos = new java.util.LinkedHashSet<>(); // Mantém a ordem de inscrição
    private java.util.Set<Conteudo> conteudosConcluidos = new java.util.LinkedHashSet<>(); // Mantém a ordem de conclusão

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());// Adiciona todos os conteúdos do bootcamp aos inscritos (addAll é usado para adicionar uma coleção inteira)
        bootcamp.getDevsInscritos().add(this); // Adiciona o dev à lista de inscritos do bootcamp
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst(); // Pega o primeiro conteúdo inscrito
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get()); // Adiciona o conteúdo concluído ao conjunto de concluídos
            this.conteudosInscritos.remove(conteudo.get()); // Remove o conteúdo do conjunto de inscritos
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp() {
        return this.conteudosConcluidos
                .stream() // uma stream é usada para processar coleções de forma funcional, ela permite operações como map, filter, reduce, etc.
                .mapToDouble(conteudo -> conteudo.calcularXp())
                .sum(); // retrna a soma do XP de todos os conteúdos concluídos
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
