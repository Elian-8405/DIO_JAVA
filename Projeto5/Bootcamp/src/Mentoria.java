import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private final LocalDate data = LocalDate.now();


    public LocalDate getData() {
        return data;
    }



    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public double CalcularXp() {
        return 0;
    }
}
