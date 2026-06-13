
import java.util.Scanner;
public class App
{
   public static void main(String args[]){
       Banco banco= new Banco();
       Scanner sc= new Scanner(System.in);
       System.out.println("Ingrese el nombre del titular de cuenta: ");
       String titular= sc.nextLine();
       System.out.println("Ingrese el saldo inicial: ");
       double saldo= sc.nextDouble();
        System.out.println("Que tipo de cuenta quiere crear?(Ahorro/Corriente) ");
        sc.nextLine();
        String tipoCuenta= sc.nextLine();
        if(tipoCuenta.equals("Ahorro")){   
          CajaDeAhorro ahorro= new CajaDeAhorro(titular,saldo,4);
          System.out.println("Cuenta de ahorro creada con exito ");
        }else if(tipoCuenta.equals("Corriente")){
           CuentaCorriente corriente= new CuentaCorriente(titular,saldo,50);
           System.out.println("Cuenta corriente creada con exito ");
        }
    }
}
