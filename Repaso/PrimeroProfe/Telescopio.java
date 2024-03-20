package Repaso.PrimeroProfe;

public class Telescopio{
  public Telescopio(){
  }

  public Long distancia(Planetas p){
    return p.getDist();
  }

  public void tipo(Planetas p){
    System.out.println("El planeta es " + p.getTipo().name().toLowerCase());
  }
}
