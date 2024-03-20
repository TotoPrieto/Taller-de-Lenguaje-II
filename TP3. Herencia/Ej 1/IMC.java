public class IMC{
  private double peso;
  private double altura;
  
  public IMC(){}

  public IMC(double a, double b){
    peso=a;
    altura=b;

  }
  
  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double calcular(){
    double tot=0; 
    tot= (peso/(Math.pow(altura,2)));
    return tot;
  } 

  public double calcular(double pes, double alt){
    double tot=0;
    tot= pes/(Math.pow(alt,2));
    return tot;
  }
      


}