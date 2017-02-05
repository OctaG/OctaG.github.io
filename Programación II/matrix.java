public class matrix{
    public static void main(String[]args){
        
        //Declaración de constantes
    
        final int TAMY = 2;
        final int TAMX = 2;
    
        //Declaración de variables
        String[][] matriz = new String[TAMX][TAMY];
        
        //Capturar contenido del arreglo
        for(int x = 0; x<TAMX; x++){
            
            for(int y = 0; y<TAMY; y++){
                matriz[x][y] = x + "," + y;
            }//fin del for y
            
        }//fin del for x
        
        //Imprimir contenido del arreglo
        for(int x = 0; x<TAMX; x++){
            
            for(int y = 0; y<TAMY; y++){
                System.out.print("(" + matriz[x][y] + ")  ");
            }//fin del for x
            
            System.out.println("");

        }//fin del for y
        
    }//cierre main
}//ciere clase
