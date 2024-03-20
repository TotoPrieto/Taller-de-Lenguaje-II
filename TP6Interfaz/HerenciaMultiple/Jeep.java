package TP6Interfaz.HerenciaMultiple;
public class Jeep extends Vehiculo implements VehiculoDeTierra {
  
  public Jeep(){
  }

  public void sonarBocina(){
    System.out.println("PIIIP");
  } 

  public void conducir(){
    System.out.println("Arranco");
  }
  
}
