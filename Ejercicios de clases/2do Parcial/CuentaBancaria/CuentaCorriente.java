

public class CuentaCorriente extends CuentaBancaria
{
    private double limiteSobregiro;
    private double deuda;
   public CuentaCorriente(String titular, double saldo,double limiteSobregiro){
     super(titular,saldo);
     this.limiteSobregiro=limiteSobregiro;
     deuda=0;
  }
  @Override
  public void retirar(double cant){
       if(cant>0){
           if(cant<=(getSaldo()+limiteSobregiro)){
               if(cant<=getSaldo()){
                  setSaldo(getSaldo()-cant); 
                  agregarMov("Retiro de "+ cant+" | El saldo actual es: "+ getSaldo());
               }else{
                  deuda=cant-getSaldo();
                  setSaldo(0);
               }
            
           }else{
            System.out.println("Saldo insuficiente");
           }
      }else{
          System.out.println("Cantidad no valida");
      }
  }
  public void mostrarClientesConDeuda(){
    System.out.println("El titular: " + getTitular() + "tiene deuda de: " + deuda);
  }
}
