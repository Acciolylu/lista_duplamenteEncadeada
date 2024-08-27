public class main {
    public static void main(String[] args) {

        Fila f = new Fila();

        if(f.verifica()){
            System.out.println("Fila vazia");
        }

        f.inserir("bala");
        f.inserir("doce");
        f.inserir("leite");
        f.inserir("bolo");
        f.inserir("trufa");


        if(!f.verifica()){
            System.out.println("Fila prenchida");
            System.out.println("=================================================");
        }

        f.mostrar();

        System.out.println("=================================================");
        System.out.println("Removendo o primeiro elemento da fila: "+f.remover());
        System.out.println("Removendo o segundo elemento da fila: "+f.remover());

        System.out.println("=================================================");
        f.mostrar();


        




    
}
}
