/*
 Octavio Garduza
 19-01-17
 Creación de un rectángulo
 */

import java.util.*;

public class rectangulo{
    public static void main(String[]args){
        
        //Declaración de variables
        int largo, ancho;
        Scanner lectura = new Scanner(System.in);
        
        //Preguntar el largo y ancho del cuadrado
        System.out.println("¿Qué largo tendrá tu rectángulo?: ");
        largo = lectura.nextInt();
        
        System.out.println("¿Qué ancho tendrá tu rectángulo?: ");
        ancho = lectura.nextInt();
        
        //Inicio del ciclo en el eje y
        for (int y = 0; y< ancho; y++){
            
            //Inicio del ciclo en el eje x
            for (int x = 1; x<largo; x++){
                
                System.out.print("*");
                
            }//Cierre de ciclo
            
            System.out.println("*");
            
        }//Cierre de ciclo

    }//Cierre de método
}//Cierre de clase
