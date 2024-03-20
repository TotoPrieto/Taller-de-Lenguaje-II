package Parcial1;

public class Jugador {
  
  //Variables

  private String jugador;
  private Jugadas j;

  //Constructores
  public Jugador(int i) {
    this.jugador = ("Jugador" + i);
  }
  /*
   * El especificar que jugador es sirve para imprimir las jugadas
   */

  //Metodos

  public Jugadas jugar(){
    //Va a devolver un valor entre 0 y 1. Asi que en base al resultado asigno un tipo de jugada
    double i= Math.random();
    if (i >= 0 && i< 0.33){
      return j.PIEDRA;
    }else if (i>= 0.33 && i< 0.66){
        return j.PAPEL;
      } else {
        return j.TIJERAS;
      }
    }


  public String loQueSeJugo(Jugadas ju){
    return "El "+ jugador + " jugo: "+ju.name();
  }

}
