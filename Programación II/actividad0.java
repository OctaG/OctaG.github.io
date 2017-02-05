/*
*Octavio Garduza 
*Actividad 0 
*12-01-17
*/

package actividad0;
import java.util.*;

public class actividad0 {

    static int[] listaA, listaB, listaC;
    static Scanner lectura = new Scanner(System.in);
    
    public static void main(String[] args) {
         
        int arrayLength;
        
        System.out.println("Escribe la longitud de tus arreglos: ");
        arrayLength = lectura.nextInt();
        
        listaA = new int [arrayLength];
        listaB = new int [arrayLength];
        listaC = new int [arrayLength];
        
        
        capturar();
        sumar();
        mostrar();
        
    }
    
    public static void capturar(){
        int numero;
        for (int i = 0; i < listaA.length; i++){
            System.out.println("Escribe un numero para el arreglo A");
            numero = lectura.nextInt();
            listaA[i] = numero; 
            
            System.out.println("Escribe un numero para el arreglo B");
            numero = lectura.nextInt();
            listaB[i] = numero; 
            
        }
        
    }
        
    public static void sumar(){
        int suma; 
        for (int i = 0; i < listaA.length; i++){
            suma = listaA[i] + listaB[i];
            listaC[i] = suma;
        }
            
    }
    
    public static void mostrar(){
        for (int i = 0; i < listaA.length; i++){
            System.out.println(listaA[i] + "+" + listaB[i] + "=" + listaC[i]);
        }
    } 
    
       
}
    

