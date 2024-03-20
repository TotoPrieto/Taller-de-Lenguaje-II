import java.util.Arrays;
import java.util.Comparator;

public class TestEj1{
  public static void main (String args[]){
    Persona[] arrayP = new Persona[3];
    Persona uno = new Persona("Tomas","Prieto",19);
    Persona dos = new Persona("Malena","Prieto", 18);
    Persona tres = new Persona("Martina","Dupont",19);
    arrayP[0]=uno;
    arrayP[1]=dos;
    arrayP[2]=tres;
    ComparadorP<Persona> comparador = new ComparadorP<Persona>();
    Arrays.sort(arrayP, comparador);
    for(int i=0; i<3; i++){
      System.out.println(arrayP[i].getApellido() + ", " + arrayP[i].getNombre());
    }
    Empleado[] arrayE = new Empleado[3];
    Empleado u = new Empleado("r", "z", 0 , 0, 900);  
    Empleado d = new Empleado("r", "z", 0, 0, 800);
    Empleado t = new Empleado("d", "c", 0, 0, 1000);
    arrayE[0]=u;
    arrayE[1]=d;
    arrayE[2]=t;
    ComparadorP<Empleado> comparador2 = new ComparadorP<Empleado>();
    Arrays.sort(arrayE, comparador2);
    /*
     * Sino para no crear la clase comparador se puede hacer lo siguiente:
     * Comparator<Empleado> comparador = Comparator.comparing(Empleado::getApellido).thenComparing(Empleado::getNombre).thenComparing(Empleado::getSueldo);
     * Obviamente importando la libreria: "import java.util.Comparator;"
     * El tema con la comparacion de numeros es que ordena de menor a mayor. Para darlo vuelta se puede usar despues del parentesis un .reversed. Ej:
     * "Comparator.comparing(Empleado::getSueldo).reversed()"
     */
    // Comparator<Empleado> comparador2 = Comparator.comparing(Empleado::getApellido).thenComparing(Empleado::getNombre).thenComparing(Empleado::getSueldo);
    // Arrays.sort(arrayE, comparador2);
    

    for(int i=0; i<3; i++){
      System.out.println(arrayE[i].getApellido() + ", " + arrayE[i].getNombre() + " " + arrayE[i].getSueldo());
    }
  }



}