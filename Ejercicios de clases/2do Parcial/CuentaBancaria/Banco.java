
public class Banco
{
   private CuentaBancaria cuentas[];
   private int puntero;
   public Banco(int nroCuentas){
      cuentas= new CuentaBancaria[nroCuentas];
      puntero=0;
    }
   public void agregarCuenta(CuentaBancaria cuenta){
     if(puntero<cuentas.length){
        cuentas[puntero]=cuenta;
        puntero++;
     }else{
        System.out.println("Ya esta llena la capacidad de cuentas");
     }
   }
}
