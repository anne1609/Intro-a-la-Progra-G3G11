

public class CajaDeAhorro extends CuentaBancaria
{
  private double tasaInteres;
  private double interesGanado;
  public CajaDeAhorro(String titular, double saldo,double tasaInteres){
     super(titular,saldo);
     this.tasaInteres=tasaInteres;
     interesGanado=0;
  } 
  public void calcularInteres(){
    interesGanado=(getSaldo()*tasaInteres)/100;
  }
  public void aplicarIntereses(){
    calcularInteres();
    depositar(interesGanado);
  }
}
