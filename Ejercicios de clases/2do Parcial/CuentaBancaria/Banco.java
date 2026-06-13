
public class Banco
{
   private CuentaBancaria cuentas[];
   private int puntero;
   public Banco(int nroCuentas){
      cuentas= new CuentaBancaria[nroCuentas];
      puntero=0;
    }
    public Banco(){
      cuentas= new CuentaBancaria[150];
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
   public int buscarCuenta(String nombre){
       int pos=-1;
      for(int i=0;i<puntero; i++){
       if(nombre.equals(cuentas[i].getTitular())){
           pos=i;
           break;
        }    
      }
      
      return pos;
   }
   public void eliminarCuenta(String nombre){
      int pos=buscarCuenta(nombre);
      if(pos!=-1){
       for(int i=pos;i<puntero-1;i++){
           cuentas[i]=cuentas[i+1];
        }
        cuentas[puntero-1]=null;
        puntero--;
      }else{
          System.out.println("No existe la cuenta bancaria");
      }
   }
}
