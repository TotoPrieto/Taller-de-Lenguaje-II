public class  Ej2{
  public static void main (String args[]){
    PerroPeligroso gordo = new PerroPeligroso();
    PerroPeligroso rita = new PerroPeligroso();
    gordo.ladra();
    gordo.mueveCola();
    gordo.muerde();
    rita.muerde();
    rita.ladra();
    rita.mueveCola();
  }

interface AnimalPeligroso {
void muerde();
}

interface PerroDomestico {
void ladra();
void mueveCola();
}

public class PerroPeligroso implements AnimalPeligroso, PerroDomestico {
public void muerde() {
System.out.println("GRRRR!");
}
public void ladra() {
System.out.println("GUAU GUAU!");
}
public void mueveCola() {
System.out.println("Mueve cola");
}
}
}