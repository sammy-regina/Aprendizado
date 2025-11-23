package desafio01DioPOO.src.dominio;

public class Curso {
    /* modificadores de acesso:
    public - acessível de qualquer lugar
    protected - acessível dentro do mesmo pacote e subclasses
    default (sem modificador) - acessível apenas dentro do mesmo pacote
    private - acessível apenas dentro da própria classe
     */

    private String titulo;
    private String descricao;
    private int cargaHoraria;

    // construtor vazio
    public Curso() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
