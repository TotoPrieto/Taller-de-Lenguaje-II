public class CharlyGarcia{
  private static CharlyGarcia instancia;

  private CharlyGarcia(){

  }

  public void cantar(){
    System.out.println("Charly Garcia esta cantando");
  }

  public static CharlyGarcia getInstancia(){
    if (CharlyGarcia.instancia == null) {
      CharlyGarcia.instancia = new CharlyGarcia();
    }

    return CharlyGarcia.instancia;
  }


}