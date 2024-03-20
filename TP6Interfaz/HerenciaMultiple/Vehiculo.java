package TP6Interfaz.HerenciaMultiple;
public class Vehiculo {
  private String nombre;
  private int maximoPasajeros;
  private double maximaVelocidad;

  public Vehiculo(String nombre, int maximoPasajeros, double maximaVelocidad) {
    this.nombre = nombre;
    this.maximoPasajeros = maximoPasajeros;
    this.maximaVelocidad = maximaVelocidad;
  }
  public Vehiculo() {
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public int getMaximoPasajeros() {
    return maximoPasajeros;
  }
  public void setMaximoPasajeros(int maximoPasajeros) {
    this.maximoPasajeros = maximoPasajeros;
  }
  public double getMaximaVelocidad() {
    return maximaVelocidad;
  }
  public void setMaximaVelocidad(double maximaVelocidad) {
    this.maximaVelocidad = maximaVelocidad;
  }

}
