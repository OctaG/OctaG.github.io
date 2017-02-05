/* 
 Octavio Garduza
 24-01-27
 Boleta de Calificaciones
*/

import java.util.*;

public class boleta{
    
    //Declaración de variables globales
    
    static final int MATERIAS = 3;
    static final int PARCIALES = 2;
    
    static int numMateria = -1;
    
    static String[] materia = new String[MATERIAS];
    static int[][] boleta = new int[MATERIAS][PARCIALES];
    
    static Scanner lectura = new Scanner(System.in);
    
    public static void main(String[]args){
        
        capturaNombre();
        capturaCalif();
        imprimeBoleta();
        cambiarCalif();
    }
    
    public static void imprimeBoleta(){
    
        for (int x = 0; x<MATERIAS; x++){
            System.out.print(materia[x] + ":\t");
            for(int y = 0; y<PARCIALES; y++){
                System.out.print(boleta[x][y] + "  ");
            }
            System.out.println("");
        }
    
    }//Cierre del método
    
    public static void capturaNombre(){
        String nombreMateria;
        
        for (int i = 0; i<MATERIAS; i++){
            System.out.println("¿Qué materia deseas agregar?: ");
            nombreMateria = lectura.nextLine();
            materia[i] = nombreMateria;
        }

        
    }//Cierre del método
    
    public static void capturaCalif(){
        int calificacion;
        
        for (int x = 0; x<MATERIAS; x++){
            for(int y = 0; y<PARCIALES; y++){
                System.out.println("Escribe la calificación de " + materia[x] + " para el parcial " + (y+1) + ": ");
                calificacion = lectura.nextInt();
                boleta[x][y] = calificacion;
            }
        }

        
    }//Cierre método
    
    
    public static void buscarMateria(){
        
        String nombreMateria;
        
        System.out.println("¿Qué materia deseas cambiar?: ");
        nombreMateria = lectura.next();
        
        for (int i = 0; i < materia.length; i++){
            
            if (nombreMateria.equals(materia[i])){
                numMateria = i;
                break;
            }
        }
    
    }//Cierre método
    
    public static void cambiarCalif(){
        
        int numParcial;
        int nuevaCalif;
        
        buscarMateria();
        
        if(numMateria != -1){
            
            System.out.println("¿Qué parcial deseas cambiar?: ");
            numParcial = lectura.nextInt() - 1;
            
            System.out.println("La calificación actual es: " + boleta[numMateria][numParcial]);
            
            System.out.println("¿Qué calificación nueva deseas agregar?: ");
            nuevaCalif = lectura.nextInt();
        
            boleta[numMateria][numParcial] = nuevaCalif;
            
            imprimeBoleta();
        }
        else{
            System.out.println("Esa materia no existe");
        }
    }
}
