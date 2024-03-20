package Repaso.PrimeroProfe;
import java.util.Arrays;

public class TestPlanetas {
    
    public static void main(String[] args) {
        SistemaSolar sistema = SistemaSolar.getInstancia();
        Telescopio t = new Telescopio();
        
        for (Planetas i : Arrays.asList(sistema.getPlanetas())) {
            System.out.println(i.toString());
            t.tipo(i);
        }
    }
}
/* Para correr el jar hago:
 * java -jar Taller-de-Lenguajes-II.jar
 */