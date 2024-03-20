package TP6Interfaz.HerenciaMultiple;
public class Aerodeslizador extends Vehiculo implements VehiculoDeTierra, VehiculoDeMar {
  
  public Aerodeslizador(){
  }

  public void entrarATierra(){
    System.out.println("Entro a tierra");
  } 

  
  public void entrarAMar(){
    System.out.println("Entro a mar");
  } 

  public void conducir(){
    System.out.println("Arranco");
  }

  public void emprenderMarcha(){
    System.out.println("Emprendio marcha");
  } 
  
}
