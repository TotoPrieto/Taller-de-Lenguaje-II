package Parcial1;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Bienvenido al Piedra, Papel o Tijeras!!!!");
    
    System.out.println("Ingrese el numero de rondas que quiere jugar: 1 - 3 - 5");
    int num = s.nextInt();
    while(num !=1 && num!=3 && num!=5){
      System.out.println("Error. Ingrese nuevamente las rondas a jugar.");
      num = s.nextInt();  
    } 

    Jugador jug1 = new Jugador(1);
    Jugador jug2 = new Jugador(2);
    //No creo Rondas, porque ya se crea sola. 
    Rondas partida = Rondas.getRondas();
    partida.setNumRondas(num);
    //Variables de jugadas actuales
    Jugadas j1;
    Jugadas j2;


    System.out.println("Excelente. Hora de jugar!");

    while(!partida.finalizo()){
      j1=jug1.jugar();
      System.out.println(jug1.loQueSeJugo(j1));
      j2=jug2.jugar();
      System.out.println(jug2.loQueSeJugo(j2));
      System.out.println(partida.sumarPuntos(j1, j2));
    }

    System.out.println("Partida finalizada. Resultado:  " +partida.resultado());

    s.close();
  }
}
