package unlpinfomath;

import java.util.Scanner;

public class TestComplex {
  public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese parte real: ");
		double re = scanner.nextDouble(); 
		System.out.println("Ingrese parte imaginaria: ");
		double im = scanner.nextDouble();
		Complex c1 = new Complex(re, im);
    System.out.println("c1: " + c1.toString());
		
		System.out.println("Ingrese parte real: ");
		re = scanner.nextDouble(); 
		System.out.println("Ingrese parte imaginaria: ");
		im = scanner.nextDouble();
		Complex c2 = new Complex(re, im);
		System.out.println("c2: "+ c2.toString());	

		
		Complex c3 = new Complex(0, 0);
		c3 = c1.add(c2);
    System.out.println("Suma: " + c3.toString());
		c3 = c1.subtract(c2);
		System.out.println("Resta: " + c3.toString());
		
		scanner.close();	
	}

  
}
