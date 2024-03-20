package Repaso.PrimeroProfe;

import java.util.Objects;


public class Planetas {
  String nombre;
  int lunas;
  TipoPlaneta tipo;
  long km;
  long dist;


  public Planetas(String nombre, long km, long dist,int lunas, TipoPlaneta tipo) {
    this.nombre = nombre;
    this.lunas = lunas;
    this.tipo = tipo;
    this.km = km;
    this.dist = dist;
  }
  public Planetas() {
  }

  public String getNombre(){
    return this.nombre;
  }

  public void setNombre(String nombre){
    this.nombre=nombre;
  }

  public int getLunas() {
    return lunas;
  }
  public void setLunas(int lunas) {
    this.lunas = lunas;
  }
  public TipoPlaneta getTipo() {
    return tipo;
  }
  public void setTipo(TipoPlaneta tipo) {
    this.tipo = tipo;
  }
  public long getKm() {
    return km;
  }
  public void setKm(long km) {
    this.km = km;
  }
  public long getDist() {
    return dist;
  }
  public void setDist(long dist) {
    this.dist = dist;
  }

  @Override
  public String toString(){
    return "Nombre= " + nombre + ", cantLunas=" + lunas + ", diametro=" + km + ", distanciaAlSol=" + dist; 
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) 
      return true;
    if (o == null || getClass() != o.getClass()) 
      return false;
    Planetas planetas = (Planetas) o;
    return lunas == planetas.lunas && km == planetas.km && dist == planetas.dist && Objects.equals(nombre, planetas.nombre) && tipo == planetas.tipo;
  }
  
  @Override
	public int hashCode() {
    return Objects.hash(nombre, lunas, tipo, km, dist);
	}
}
