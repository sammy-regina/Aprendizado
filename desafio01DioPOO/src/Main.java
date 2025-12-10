package desafio01DioPOO.src;

import desafio01DioPOO.src.dominio.Bootcamp;
import desafio01DioPOO.src.dominio.Conteudo;
import desafio01DioPOO.src.dominio.Curso;
import desafio01DioPOO.src.dominio.Dev;
import desafio01DioPOO.src.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(java.time.LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de JavaScript");
        mentoria2.setDescricao("Descrição mentoria JavaScript");
        mentoria2.setData(java.time.LocalDate.now());

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devAlice = new Dev();
        devAlice.setNome("Alice");
        devAlice.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Alice: " + devAlice.getConteudosInscritos());
        devAlice.progredir();
        System.out.println("Conteúdos Inscritos Alice: " + devAlice.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Alice: " + devAlice.getConteudosConcluidos());
        System.out.println("XP Total Alice: " + devAlice.calcularTotalXp());
        devAlice.progredir();
        System.out.println("Conteúdos Inscritos Alice: " + devAlice.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Alice: " + devAlice.getConteudosConcluidos());
        System.out.println("XP Total Alice: " + devAlice.calcularTotalXp());
        System.out.println("-----");

        Dev devBob = new Dev();
        devBob.setNome("Bob");
        devBob.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bob: " + devBob.getConteudosInscritos());
        devBob.progredir();
        System.out.println("Conteúdos Inscritos Bob: " + devBob.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Bob: " + devBob.getConteudosConcluidos());
        System.out.println("XP Total Bob: " + devBob.calcularTotalXp());


    }
}
