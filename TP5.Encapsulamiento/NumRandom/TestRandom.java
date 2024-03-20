package NumRandom;

public class TestRandom {
  public static void main(String args[]){
    
    /*GeneraRandom num = new GeneraRandom(99);
    System.out.println("El numero es "+ num.obtenerRandom());
    //Esto era sin hacer la instancia unica
    */

    GeneraRandom num = GeneraRandom.getNum();
    System.out.println("El numero es "+ num.obtenerRandom());

  }
}

// Para correr el jar que cree (Taller-de-Lenguajes-II.jar) pongo:
// java -jar Taller-de-Lenguajes-II.jar
