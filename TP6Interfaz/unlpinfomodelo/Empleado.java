
public class Empleado extends Persona{
  private long legajo;
  private double sueldo;
  
  public Empleado(long legajo, double sueldo) {
    this.legajo = legajo;
    this.sueldo = sueldo;
  }
  public Empleado(String nombre, String apellido, int edad, long legajo, double sueldo) {
    super(nombre, apellido, edad);
    this.legajo = legajo;
    this.sueldo = sueldo;
  }
  
  public long getLegajo() {
    return legajo;
  }
  public void setLegajo(long legajo) {
    this.legajo = legajo;
  }
  public double getSueldo() {
    return sueldo;
  }
  public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
  }
 


}