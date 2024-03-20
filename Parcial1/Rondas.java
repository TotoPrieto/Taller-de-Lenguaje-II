package Parcial1;


public class Rondas {
  //Variables
  private int numRondas;
  private int rondaActual;
  private int ganadasJug1=0;
  private int ganadasJug2=0;
  private static Rondas r = new Rondas();
  /*
   *El numero de rondas va a indicar hasta que momento se va a jugar la partida
   */

  //Constructores
  private Rondas() {
  }

  //Metodos
  
  public static Rondas getRondas(){
    return r;
  }

  public int getNumRondas() {
    return numRondas;
  }

  public void setNumRondas(int i){
    this.numRondas= i;
  }

  public boolean finalizo(){

    //De esta manera corroboro que se hayan jugado todas las rondas
    rondaActual= rondaActual+1;
    if (rondaActual <= numRondas){
      return false;
    } else {
      return true;
    }
  }

  public String sumarPuntos(Jugadas jug1, Jugadas jug2){
    
    if (jug1.name().equals(jug2.name())){
      ganadasJug1= ganadasJug1+1;
      ganadasJug2= ganadasJug2+1;
      return "Empate";
    }

    if ((jug1.name().equals("PIEDRA") && jug2.name().equals("TIJERAS"))||(jug1.name().equals("TIJERAS") && jug2.name().equals("PAPEL"))||(jug1.name().equals("PAPEL") && jug2.name().equals("PIEDRA"))){
      ganadasJug1= ganadasJug1+1;
      return "Jugador 1 gano esta ronda";
    }else {
      ganadasJug2= ganadasJug2+1;
      return "Jugador 2 gano esta ronda";
    }
  }

  public String resultado(){
    if (ganadasJug1 == ganadasJug2){
      return "EMPATE";
    }

    if (ganadasJug1>ganadasJug2){
      return "GANO JUGADOR 1";
    }
    
    return "GANO JUGADOR 2";
    }
  }

