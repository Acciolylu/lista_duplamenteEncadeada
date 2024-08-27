import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Lista ListaNomes = new Lista();
 
        Scanner scanner = new Scanner(System.in);

        for( int i=0;i<4;i++){
            System.out.println("Qual nome deseja adicionar no ínicio da lista? ");
            String nome = scanner.nextLine();
            ListaNomes.adicionarNoInicio(nome);
        }
      
        System.out.println("--------------------------- ");
        
        ListaNomes.imprimir();


        
        for( int i=0;i<4;i++){
            System.out.println("Qual nome deseja adicionar no fim da lista? ");
            String nome = scanner.nextLine();
            ListaNomes.adicionarNoFim(nome);

        }

        System.out.println("--------------------------- ");
        
        ListaNomes.imprimir();

        System.out.println("Qual nome deseja adicionar na lista? ");
        String nome = scanner.nextLine();
        System.out.println("Em qual posição deseja adicionar? ");
        int pos = scanner.nextInt();
        ListaNomes.adicionarPosicao(pos, nome);

        ListaNomes.imprimir();

        System.out.println("--------------------------- ");

        ListaNomes.removerInicio();
        ListaNomes.imprimir();

        System.out.println("--------------------------- "); 

        ListaNomes.removerFim();
        ListaNomes.imprimir();

        System.out.println("--------------------------- ");

        System.out.println("Qual posição deseja remover? ");
        int n = scanner.nextInt();

        ListaNomes.removerPosicao(n);

        ListaNomes.imprimir();

    }
    
  
}
