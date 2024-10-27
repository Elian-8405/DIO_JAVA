public class Curso extends Conteudo{
    //Atributos


    private int cargaHoraria;



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

    @Override
    public double CalcularXp() {

        return XP_PADRAO * cargaHoraria;
    }
}
