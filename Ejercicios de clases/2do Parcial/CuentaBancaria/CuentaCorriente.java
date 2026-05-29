

public class CuentaCorriente extends CuentaBancaria
{
    private double limiteSobregiro;
   public CuentaCorriente(String titular, double saldo,double limiteSobregiro){
     super(titular,saldo);
     this.limiteSobregiro=limiteSobregiro;
  }
  @Override
  public void retirar(double cant){
       if(cant>0){
           if(cant<=(getSaldo()+limiteSobregiro)){
            setSaldo(getSaldo()-cant);
           }else{
            System.out.println("Saldo insuficiente");
           }
      }else{
          System.out.println("Cantidad no valida");
      }
    }
}
