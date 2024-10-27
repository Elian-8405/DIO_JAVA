//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Conteudo curso1 = new Curso();
        Conteudo mentoria1 = new Mentoria();

        curso1.setTitulo("Curso1");
        curso1.setDescricao("Descricacao 1");
        mentoria1.setTitulo("Mentoria 1");
        mentoria1.setDescricao("Descricao mentoria");


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descricao Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev devElia = new Dev();
        devElia.setNome("Elia");
        devElia.inscreverBootcamp(bootcamp);
        devElia.progredir();
        System.out.println("Conteudos: "+ devElia.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: "+ devElia.getConteudosConcluidos());




    }
}