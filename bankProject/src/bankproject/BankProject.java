
package bankproject;
import static bankproject.bankMethods.*;
import java.util.*;

public class BankProject {
    
    //Declaración de variables globales
    
    static ArrayList <String> user = new ArrayList<>();
    static ArrayList <String> password = new ArrayList<>();
    static ArrayList <String> accountNumber = new ArrayList<>();
    static List<List<Integer>> balance = new ArrayList<>();
    static String myUser, myPassword;
    static int input, log = 0, myBalance, inputMenu;
    static boolean isLogged = false;

    
    public static void main(String[] args) {
        
        
        //ciclo que permite que el programa corra mientras el usuario no de click en cerrar
        while (inputMenu != -1){
            
            //creación del menú de log in / sign up
            bankMethods.initialMenu();
            
            //cambio entre log in / sign up
            switch (inputMenu){
                
                //caso en el que el usuario quiere crear una cuenta
                case 0:
                    //creación de una cuenta
                    bankMethods.signUp();
                    break;
                //caso en el que el usuario quiere entrar a su cuenta   
                case 1:
                    //entrar a su cuenta
                    logIn();
                    break;
            }
            
            //if que evalua si existe ua cuenta en uso.
            if (isLogged){
                
                //ciclo que permite que el menú de la cuenta se muestre hasta que el usuario decida salir al menú inicial.
                while (inputMenu != 3 && inputMenu != -1){
                    
                    //menú de la cuenta.
                    bankMethods.mainMenu();
                    
                    //cambio entre las opciones de la cuenta
                    switch (inputMenu){
                        
                        case 0:
                            //crear menú de retiros/depositos
                            bankMethods.modifyBalance();
                            break;
                        case 1: 
                            //mostrar balance total de la cuenta
                            bankMethods.viewBalance();
                            break;
                        case 2:
                            //método que no hace nada 
                            bankMethods.resumenBalance();
                            break;
                               
                        case -1:
                        case 3:
                            isLogged = false;
                            break;
                    
                    }//cierre switch
                    
                }//cierre while
            
            }//cierre if
                
        }//cierre while
        
    }//cierre método main
    
}//cierre clase
