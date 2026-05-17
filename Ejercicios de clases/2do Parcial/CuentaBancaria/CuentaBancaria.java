public class CuentaBancaria
{
    double saldo;
    String titular;
    CuentaBancaria(String titular,double saldo){
        this.titular=titular;
        this.saldo=saldo;
    }
    void depositar(double cant){
     if(cant>0){
      saldo=saldo+cant;
     }else{
        System.out.println("Cantidad no valida");
     }
    }
    void retirar(double cant){
       if(cant>0){
           if(cant<=saldo ){
            saldo=saldo-cant;
           }else{
            System.out.println("Saldo insuficiente");
           }
      }else{
          System.out.println("Cantidad no valida");
      }
    }
    void mostrar(){
        System.out.println("El saldo es: "+ saldo +" de la cuenta de " + titular );
    }
    public static void main(String args[]){
        CuentaBancaria cuentas[]= new CuentaBancaria[3];
        cuentas[0]= new CuentaBancaria("Maria",1000);
        cuentas[1]= new CuentaBancaria("Juan",500);
        cuentas[2]= new CuentaBancaria("Luis",2000);
        cuentas[0].depositar(5);
        cuentas[0].retirar(100);
        cuentas[0].mostrar();
    }
}