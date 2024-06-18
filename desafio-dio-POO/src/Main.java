import java.time.LocalDate;
import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descricao curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao mentoria Java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDouglas = new Dev();
        devDouglas.setNome("Douglas Mota");
        devDouglas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Douglas" + devDouglas.getConteudosInscritos());

        devDouglas.progredir();
        devDouglas.progredir();
        System.out.println("----");
        System.out.println("Conteudos Inscritos Douglas" + devDouglas.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Douglas" + devDouglas.getConteudosConcluidos());
        System.out.println("XP: " + devDouglas.calcularTotalXp());
        
        System.out.println("---------------------------------");

        Dev devLiane = new Dev();
        devLiane.setNome("Eliane Coutinho");
        devLiane.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Eliane" + devLiane.getConteudosInscritos());

        devLiane.progredir();
        System.out.println("----");
        System.out.println("Conteudos Inscritos Eliane" + devLiane.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Eliane" + devLiane.getConteudosConcluidos());
        System.out.println("XP: " + devLiane.calcularTotalXp());


    }
}
