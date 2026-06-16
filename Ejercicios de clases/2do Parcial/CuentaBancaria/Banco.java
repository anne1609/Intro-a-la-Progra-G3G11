
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
   public void ordenarPorCliente(){
     for(int i=0;i<puntero-1;i++){
        for(int j=0;j<puntero-1-i;j++){
            if(cuentas[j].getTitular().compareToIgnoreCase(cuentas[j+1].getTitular())>0) {
               CuentaBancaria aux=cuentas[j];     
               cuentas[j]= cuentas[j+1];
               cuentas[j+1]=aux; 
            }
        }
     }
  }
  public void insertarCuenta(CuentaBancaria cuenta, int pos){
    if(puntero<cuentas.length && pos>=0 && pos<=puntero){
        for(int i=puntero;i>pos;i--){
            cuentas[i]= cuentas[i-1];
        }
        cuentas[pos] =cuenta;
        puntero++;
    }else{
       System.out.println("No se puede insertar");
    }
  }
}
