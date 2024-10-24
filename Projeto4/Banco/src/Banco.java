import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Conta> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }




    public void cadastrarConta(Conta c){
        if(c != null){
            contas.add(c);
        }
    }

    public void listarContas(){
        System.out.println(contas);
    }


}
