/*
 Octavio Garduza
 17-01-17
 Actividad 1
 */

import java.util.*;

public class ejercicioCiclos{
    public static void main(String[]args){
        
        int nPeces;
        int comidaPez;
        int  sumaComida = 0;
        double promedioComida;
        int totalComida = 0;
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("¿Cuántos peces hay?: ");
        nPeces = lectura.nextInt();
        
        for(int x = 0; x<nPeces; x++){
            
            for (int i = 0; i<4; i++){
                
                System.out.println("¿Cúanto comió el pez " + (x+1) + " en su comida número " + (i+1) + "?: " );
                comidaPez = lectura.nextInt();
                sumaComida = sumaComida + comidaPez;
                
            }
            
            promedioComida = sumaComida / 4;
            
            System.out.println("El pez " + (x+1) + " comió en promedio " + promedioComida + " gramos." );
            
            totalComida = totalComida + sumaComida;
            sumaComida = 0;
        }
        System.out.println("El total de comida usado en esta pecera son: " + totalComida + " gramos." );
    }
}



