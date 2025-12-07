package desafio01DioPOO.src.dominio;

public class Curso extends Conteudo {
    /* modificadores de acesso:
    public - acessível de qualquer lugar
    protected - acessível dentro do mesmo pacote e subclasses
    default (sem modificador) - acessível apenas dentro do mesmo pacote
    private - acessível apenas dentro da própria classe
     */

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    // construtor vazio
    public Curso() {
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
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
