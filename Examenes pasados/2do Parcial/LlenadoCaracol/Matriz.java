
import java.util.Scanner;
public class Matriz
{
   public static void main(String args[]){
        System.out.println("Introduzca el tamanio de la matriz:");
        Scanner sc=new Scanner(System.in);
        int tam= sc.nextInt();
        int ini=0;
        int fin=tam;
        int mat[][]=new int[tam][tam];
        int valor=1;
        while(ini<fin){
         //izq-der
         for(int j=ini;j<fin;j++){
             mat[ini][j]=valor;
             valor++;
         }
         //arriba- abajo
         for(int i=ini+1;i<fin;i++){
             mat[i][fin-1]=valor;
             valor++;
         }
         //der-izq
         for(int j=fin-2;j>=ini;j--){
             mat[fin-1][j]=valor;
             valor++;
         }
         //aba-arri
         for(int i=fin-2;i>ini;i--){
             mat[i][ini]=valor;
             valor++;
         }

         ini=ini+1;
         fin=fin-1;
        }
        System.out.println("Matriz caracol ");
        for(int i=0;i<tam;i++){
            for(int j=0;j<tam;j++){
               System.out.print(mat[i][j]+"\t"); 
            }
            System.out.println();
        }
    }
}
