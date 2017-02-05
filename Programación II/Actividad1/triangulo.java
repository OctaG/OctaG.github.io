/*
 Octavio Garduza
 19-01-17
 Creación de un triángulo
 */

import java.util.*;

public class triangulo{
    public static void main(String[]args){
        
        //Declaración de variables
        int num;
        Scanner lectura = new Scanner(System.in);
        
        //Preguntar la medida del triángulo
        System.out.println("¿Qué medidas tendrá tu triángulo?: ");
        num = lectura.nextInt();
        
        //Inicio del ciclo en el eje y
        for (int y = 0; y< num; y++){
            
            //Inicio del ciclo en el eje x
            for (int x = 0; x<y; x++){
                
                System.out.print("*");
                
            }//Cierre de ciclo
            
            System.out.println("*");
            
        }//Cierre de ciclo
        
    }//Cierre de método
    
}//Cierre de clase
