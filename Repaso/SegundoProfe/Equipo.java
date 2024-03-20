package Repaso.SegundoProfe;
import java.util.ArrayList;

public class Equipo {
  private ArrayList<Jugador> jugadores= new ArrayList<Jugador>();

  
  public Equipo() {
  }

  public Jugador getJugadores(int i) {
    return jugadores.get(i);
  }

  public void setJugadores(Posiciones x) {
    jugadores.add(new Jugador(x));
  }
}
