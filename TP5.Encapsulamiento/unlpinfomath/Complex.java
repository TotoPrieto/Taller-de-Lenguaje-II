package unlpinfomath;

import java.util.Objects;

public final class Complex {
  private double re;
  private double im;

  
  public Complex(double re, double im){
    this.re=re;
    this.im=im;
  }

  public double getRe() {
    return re;
  }

  public void setRe(double re) {
    this.re = re;
  }

  public double getIm() {
    return im;
  }

  public void setIm(double im) {
    this.im = im;
  }

  public Complex add(Complex c){
    Complex nuevo = new Complex(0,0);
    nuevo.im= this.im + c.im;
    nuevo.re= this.re + c.re;
    return nuevo;  
  }

  public Complex subtract(Complex c){
    Complex nuevo = new Complex(0,0);
    nuevo.im= this.im - c.im;
    nuevo.re= this.re - c.re;
    return nuevo;  
  }

  public Complex valueof(double re, double im){
    Complex nuevo = new Complex(re, im);
    return nuevo;
  }


  @Override
  public String toString(){
    String aux= ("Real=" + this.re + ". Imaginary=" + this.im);
    return aux;
  }

  @Override
	public int hashCode() {
		return Objects.hash(im, re);
	}

  @Override
  public boolean equals(Object obj){
    if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complex other = (Complex) obj;
		return Double.doubleToLongBits(im) == Double.doubleToLongBits(other.im) && Double.doubleToLongBits(re) == Double.doubleToLongBits(other.re);
	}



}
