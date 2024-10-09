import java.util.Scanner;

import service.AparelhoTelefonico;
import service.NavegadorInternet;
import service.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) throws Exception {
        int operacao;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("---------------------------");
            System.out.println("|          IPHONE         |");
            System.out.println("|                         |");
            System.out.println("|                         |");
            System.out.println("|                         |");
            System.out.println("| 1 - Ouvir Musica        |");
            System.out.println("|                         |");
            System.out.println("|                         |");
            System.out.println("| 2 - Fazer Ligação       |");
            System.out.println("|                         |");
            System.out.println("|                         |");
            System.out.println("| 3 - Navegar na Internet |");
            System.out.println("|                         |");
            System.out.println("|                         |");
            System.out.println("|                         |");
            System.out.println("| 0 - Desligar            |");
            System.out.println("|                         |");
            System.out.println("|                         |");
            System.out.println("|                         |");
            System.out.println("|                         |");
            System.out.println("---------------------------");
    
            System.out.println("Pressione o botão da atividade");
        do {
            
            operacao = scanner.nextInt();
            switch (operacao) {
                case 1:
                    int playerOption;
                    ReprodutorMusical player = new ReprodutorMusical();
                    System.out.println("1 - Para selecionar uma musica");
                    System.out.println("2 - Para tocar uma musica");
                    System.out.println("P - para pausar");
                    System.out.println("Opção: ");
                    playerOption = scanner.nextInt();
                    if(playerOption == 1){
                        String musica;
                        System.out.println("Digite o nome da musica: ");
                        musica = scanner.nextLine();
                        player.selecionarMusica(musica);
    
                    }else if(playerOption == 2){
                        player.tocar();
    
                    }else{
                        player.pausar();
                    }
                    break;
                    
                case 2:
                    AparelhoTelefonico telefone = new AparelhoTelefonico();
                    String numero;
                    int telefoneOperation;
                    System.out.println("1 - Ligar");
                    System.out.println("2 - Para anteder");
                    System.out.println("3 - Para gravar audio");
                    System.out.println("Digite a opção:");
                    telefoneOperation = scanner.nextInt();
                    if(telefoneOperation == 1){
                        System.out.println("Digite o numero:");
                        numero = scanner.nextLine();
                        telefone.ligar(numero);
                    }else if(telefoneOperation == 2){
                        telefone.atender();
                    }else{
                        telefone.iniciarCorreioVoz();
                    }
                    break;
    
                case 3:
                    NavegadorInternet nav = new NavegadorInternet();
                    String site;
                    int navOption;
                    System.out.println("1 - Para exibir pagina");
                    System.out.println("2 - Para adicionar Aba");
                    System.out.println("3 - Para recarregar guia");
                    System.out.println("Digite a opção:");
                    navOption = scanner.nextInt();
                    if(navOption == 1){
                        System.out.println("Digite o link do site:");
                        site = scanner.nextLine();
                        nav.exibirPagina(site);
                    }else if(navOption == 2){
                        
                        nav.adicionarNovaAba();
    
                    }else{
                        nav.atualizarPagina();
                    }
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
            
        } while (operacao != 0);
       
    }
}
