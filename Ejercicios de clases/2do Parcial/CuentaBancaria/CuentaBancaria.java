public class CuentaBancaria
{
    private double saldo;
    private String titular;
    private String [] movimientos;
    private int cantMov;
    CuentaBancaria(String titular,double saldo){
        this.titular=titular;
        this.saldo=saldo;
        movimientos= new String[100];
        cantMov=0;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getTitular(){
        return titular;
    }
    public void setSaldo(double nuevoSaldo){
      saldo=nuevoSaldo;
    }
    public void depositar(double cant){
     if(cant>0){
      saldo=saldo+cant;
      movimientos[cantMov]="Deposito de: " + cant + " | El saldo actual es: "+ saldo;
      cantMov++;
     }else{
        System.out.println("Cantidad no valida");
     }
    }
    
    public void retirar(double cant){
       if(cant>0){
           if(cant<=saldo ){
            saldo=saldo-cant;
            movimientos[cantMov]="Retiro de: " + cant + " | El saldo actual es: "+ saldo;
            cantMov++;
           }else{
            System.out.println("Saldo insuficiente");
           }
      }else{
          System.out.println("Cantidad no valida");
      }
    }
    public void agregarMov(String texto){
       movimientos[cantMov]= texto;
       cantMov++;
    }
    public void mostrar(){
        System.out.println("El saldo es: "+ saldo +" de la cuenta de " + titular );
    }
    /*public static void main(String args[]){
        CuentaBancaria cuentas[]= new CuentaBancaria[3];
        cuentas[0]= new CuentaBancaria("Maria",1000);
        cuentas[1]= new CuentaBancaria("Juan",500);
        cuentas[2]= new CuentaBancaria("Luis",2000);
        cuentas[0].depositar(5);
        cuentas[0].retirar(100);
        cuentas[0].mostrar();
    }*/
}