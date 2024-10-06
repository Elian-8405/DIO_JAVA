import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        int parametroUm;
        int parametroDois;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro:");
        parametroUm = input.nextInt();

        System.out.println("Digite o segundo parametro:");
        parametroDois = input.nextInt();

        try {

            contar(parametroUm, parametroDois);
            
        } catch (ParametrosInvalidosExeption Exception) {
            System.out.println("O paramentro um deve ser menor que o dois");
              
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosExeption {

        if(parametroUm >= parametroDois){
            throw new ParametrosInvalidosExeption();
        }else{
            int contagem = parametroDois - parametroUm;
         for(int i = 1; i <= contagem; i++){
            System.out.println(i);
        }

        }
         
        
    }
}
