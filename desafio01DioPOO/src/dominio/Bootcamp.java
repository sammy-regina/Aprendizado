package desafio01DioPOO.src.dominio;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final java.time.LocalDate dataInicio = java.time.LocalDate.now(); // data de criação do bootcamp
    private final java.time.LocalDate dataFim = dataInicio.plusDays(45); // a data final é a data de início + 45 dias
    private Set<Dev> devsInscritos = new HashSet<>(); // conjunto de devs inscritos no bootcamp
    private Set<Conteudo> conteudos = new LinkedHashSet<>(); // conjunto de conteúdos do bootcamp em ordem

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public java.time.LocalDate getDataInicio() {
        return dataInicio;
    }

    public java.time.LocalDate getDataFim() {
        return dataFim;
    }

    public java.util.Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(java.util.Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public java.util.Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(java.util.Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicio, bootcamp.dataInicio) && Objects.equals(dataFim, bootcamp.dataFim) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicio, dataFim, devsInscritos, conteudos);
    }
}
