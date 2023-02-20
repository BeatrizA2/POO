import java.time.LocalDate;
import dominio.Curso;
import dominio.Mentoria;
import dominio.Dev;
import dominio.Bootcamp;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBia = new Dev();
        devBia.setNome("Beatriz");
        devBia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bia:" + devBia.getConteudosInscritos());
        devBia.progredir();
        devBia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos :" + devBia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Bia:" + devBia.getConteudosConcluidos());
        System.out.println("XP:" + devBia.calcularTotalXp());

        System.out.println("-------");

        Dev devRuan = new Dev();
        devRuan.setNome("Ruan");
        devRuan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ruan:" + devRuan.getConteudosInscritos());
        devRuan.progredir();
        devRuan.progredir();
        devRuan.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ruan:" + devRuan.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Ruan:" + devRuan.getConteudosConcluidos());
        System.out.println("XP:" + devRuan.calcularTotalXp());
    }
}
