package NumRandom;

public final class GeneraRandom { //El final no permite que se creen subclases
  private int MAXIMO_VALOR;
  private static GeneraRandom num = new GeneraRandom(99);
  //Con esto hago que no se pueda crear la instancia desde el main.
  

  public static GeneraRandom getNum() {
    return num;
  } //Esta es la unica manera de obtener la instancia creada

  private GeneraRandom(int x) {
    this.MAXIMO_VALOR=x;
  }


  public int getMAXIMO_VALOR() {
    return MAXIMO_VALOR;
  }

  public void setMAXIMO_VALOR(int mAXIMO_VALOR) {
    MAXIMO_VALOR = mAXIMO_VALOR;
  }

  public int obtenerRandom(){
    int valor= (int)(Math.random()*MAXIMO_VALOR);
    boolean listo=false;
    while (listo == false){
      if (valor < 0 || valor>this.MAXIMO_VALOR){ //En teoria es al pedo corroborar
        //Siempre va a generar entre 0 y max con el random que use
        valor= (int)(Math.random()*MAXIMO_VALOR);
      }else{
        listo=true;
      }
    }
    
  
    return valor;
  }
}
