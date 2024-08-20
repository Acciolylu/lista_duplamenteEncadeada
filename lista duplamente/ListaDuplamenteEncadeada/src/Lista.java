public class Lista {

    private Celula cabeca;
    private Celula cauda;
    private int totalElementos=0;


    public void adicionarNoInicio(String nome){
      if(this.totalElementos==0) {

        Celula nova = new Celula(nome);
        this.cabeca = nova;
        this.cauda = nova;

      }else {

        Celula nova = new Celula(this.cabeca,nome);
        this.cabeca.setAnterior(nova);
        this.cabeca = nova;
    }
    this.totalElementos++;

}

public void adicionarNoFim (String nome){
 if(this.totalElementos==0){
   adicionarNoInicio(nome);
 }else{

 Celula nova = new Celula(this.cauda,nome);
    this.cauda.setProxima(nova);
    nova.setAnterior(cauda);
    this.cauda = nova;

}
 totalElementos++;
}

public void imprimir(){
    Celula aux = this.cabeca;
  for(int i=0; i<totalElementos;i++){
    System.out.println(aux.getElemento());
    aux=aux.getProxima();

  }
}

public void adicionarPosicao(int n, String nome){


}

public void removerIncio(){

}

public void removerFim(){

}

public void removerPosicao(){

}

}
    

