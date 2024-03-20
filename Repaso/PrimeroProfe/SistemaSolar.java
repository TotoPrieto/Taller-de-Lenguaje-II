package Repaso.PrimeroProfe;


public class SistemaSolar {
  private Planetas[] planetas = {    
    new Planetas("Mercurio",4878,698170,0, TipoPlaneta.ROCOSOS),
    new Planetas("Venus",12100,108000,0, TipoPlaneta.ROCOSOS),
    new Planetas("Tierra", 12756,149900,1,TipoPlaneta.ROCOSOS),
    new Planetas("Marte", 6787,228000,2,TipoPlaneta.ROCOSOS),
    new Planetas("Jupiter", 142984,750000,79,TipoPlaneta.GASEOSOS),
    new Planetas("Saturno",120536,1418000,82,TipoPlaneta.GASEOSOS),
    new Planetas("Urano", 51108,3000000,27,TipoPlaneta.GASEOSOS),
    new Planetas("Neptuno", 49538,4500000,14,TipoPlaneta.GASEOSOS),};
 // Se que no esta del todo bien, se deberia hacer con ArrayList desde aca adentro, pero es mejor para el test
 
  private static SistemaSolar INSTANCIA;

  private SistemaSolar(){
   }

  public static SistemaSolar getInstancia(){
    if (INSTANCIA == null)
      INSTANCIA = new SistemaSolar();
      return INSTANCIA;
  }
 /* Esto era porque primero lo habia hecho con ArrayList() 
  public void agregarPlaneta(Planetas p){
    planetas.add(p);
  }
*/

  public Planetas[] getPlanetas(){
    return planetas;
  }

  @Override
  public String toString(){
    return "Sistema solar formado por " + this.planetas + "."; 
  }


  // se puede usar en el ArrayList() add(), remove(), get(), set(), size()
}
