import java.time.LocalDate;

import Desafio.Dominio.Bootcamp;
import Desafio.Dominio.Curso;
import Desafio.Dominio.Dev;
import Desafio.Dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Java básico");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Python básico");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Java avançado");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Clayton");
        dev1.inscrever(bootcamp);
        System.out.println("Clayton Conteúdos inscritos: " + dev1.getInscritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Clayton Conteúdos concluídos: " + dev1.getConcluidos());
        System.out.println("Clayton Conteúdos inscritos: " + dev1.getInscritos());
        System.out.println("XP: " + dev1.totalXp());

        System.out.println("-----------");

        Dev dev2 = new Dev();
        dev2.setNome("Juliana");
        dev2.inscrever(bootcamp);
        System.out.println("> Juliana Conteúdos inscritos: " + dev2.getInscritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Juliana Conteúdos concluídos: " + dev2.getConcluidos());
        System.out.println("Juliana Conteúdos inscritos: " + dev2.getInscritos());
        System.out.println("XP: " + dev2.totalXp());
    }
}