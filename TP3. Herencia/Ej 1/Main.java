import java.util.Scanner;

public class Main {
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.print("Ingrese su altura: ");
    double altura= s.nextDouble();
    System.out.print("Ingrese su peso: ");
    double peso= s.nextDouble();
    IMC imc1= new IMC();//En este pruebo el constructor sin parametros
    IMC imc2= new IMC(peso, altura);// En este pruebo el constructor con parametros

    System.out.println("El IMC es de: " + imc1.calcular(peso, altura) );
    System.out.println("El IMC es de: " + imc2.calcular());
    
  }
}
