import java.util.Comparator;

public class ComparadorP<T> implements Comparator<Persona>{
    public int compare(Persona uno, Persona dos){
      int comparacionApellido = uno.getApellido().compareTo(dos.getApellido());

      if (comparacionApellido == 0){
        return uno.getNombre().compareTo(dos.getNombre());
      } 
      return comparacionApellido;
    }
  }
