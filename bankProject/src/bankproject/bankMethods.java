
package bankproject;
import static bankproject.BankProject.*;
import java.util.*;
import javax.swing.*;

public class bankMethods {
    
    //Metodo que crea el menú desplegable de meses
    public static void monthMenu(){
        
        String myMonth;
        
        String[] monthButton = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
               myMonth = (String) JOptionPane.showInputDialog(null, "Mes", "Octa Wallet", JOptionPane.QUESTION_MESSAGE,null, monthButton,null);
               
               for (int i = 0; i< monthButton.length; i++){
                   if(monthButton[i].equals(myMonth)){
                       input = i;
                    }
               }
    
    }
    
    //Metodo que crea el menú de inicio (Log in / Sign up) del programa.
    public static void initialMenu(){
        String[] createAccountButton = {"Sign Up", "Log In"};
        inputMenu = JOptionPane.showOptionDialog(null, "Bienvenido a Octa Wallet", "OCTA Wallet",0, JOptionPane.INFORMATION_MESSAGE, null, createAccountButton, createAccountButton[1]);
    }//Cierre método initialMenu
    
    //Metodo que permite al usuario crear una cuenta (Nombre, contraseña, balance inicial).
    public static void signUp(){

        //Declaración de variables 
        int myAccountNumber = 0;
        myUser = JOptionPane.showInputDialog("Escribe tu nuevo usuario: ");
        
        //if que evalua si el usuario ha creado su nombre de cuenta, en cuyo caso permite crear una contraseña.
        if (myUser != null){
 
            myPassword = JOptionPane.showInputDialog("Escribe tu contraseña: ");
            
            //if que evalua si el usuario ha creado su contraseña, en cuyo caso permite añadir un balance inicial.
            if (myPassword != null){
               
                    balance.add(new ArrayList<>());
                    user.add(myUser);
                    password.add(myPassword);
                    
                    //Crea los meses de la cuenta
                    log = user.indexOf(myUser);
                    
                    for (int i = 0; i<12; i++){
                        balance.get(log).add(0);
                    }
                    
                    myAccountNumber += 1;
                    accountNumber.add("A0102".concat(String.valueOf(myAccountNumber)));
                    JOptionPane.showMessageDialog(null, "Cuenta creada con exito", "Octa Wallet", JOptionPane.INFORMATION_MESSAGE);
                
            }//Cierre if
        }//Cierre if 
        
       
          
    }//Cierre método sign Up.
    
    //Metodo que permite al usuario entrar a su cuenta.
    public static void logIn(){
        
        //Declaración de variables
        myUser = JOptionPane.showInputDialog("Escriba su usuario: ");
        
        //if que evalua si el usuario escrito existe.
        if (user.contains(myUser)){
            
            log = user.indexOf(myUser);
            myUser = JOptionPane.showInputDialog("Escribe la contraseña:");
            
            //if que evalua si la contraseña coincide con el usuario.
            if (myUser.equals(password.get(log))){
                isLogged = true;
            }//Cierre if.
            
            //else que actua en caso de que la contraseña no coincida con el usuario.
            else{
               JOptionPane.showMessageDialog(null, "Contraseña Incorrecta para " + user.get(log), "Octa Wallet", JOptionPane.INFORMATION_MESSAGE);
            }//Cierre else.
            
        }//Cierre if.
        
        //else que actua en caso de que no eista el usuario.
        else{
            JOptionPane.showMessageDialog(null, "Este usuario no existe", "Octa Wallet", JOptionPane.INFORMATION_MESSAGE);
        }//Cierre else.
        
    }//Cierre método logIn.
    
    //Metodo que crea el menú principal de la cuenta.
    public static void mainMenu(){
        String[] userMenuButton = {"Editar Balance Mensual", "Ver Balance Mensual", "Resumen de balance", "Salir de la Cuenta", };
        inputMenu = JOptionPane.showOptionDialog(null, "Bienvenido " + user.get(log), "Octa Wallet", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, userMenuButton, userMenuButton[0]);
    }//Cierre método mainMenu
    
    //Metodo que le permite al usuario retirar o depositar dinero en su ceunta.
    public static void modifyBalance(){
        
        //Declararción de variables
        String[] userMenuButton = {"Depositar", "Retirar"};
        int myBalance;
        
        
        input = JOptionPane.showOptionDialog(null, "¿Desea depositar o retirar dinero?","Octa Wallet", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, userMenuButton, userMenuButton[0]);
        
        //Switch que cambia entre depositar y retirar dinero.
        switch(input){
            
            //Caso en el que el usuario quiere depositar dinero.
            case 0:
                
               monthMenu();
               myBalance = balance.get(log).get(input) + Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto dinero deseas depositar en la cuenta durante este mes?"));
               balance.get(log).set(input, myBalance);
               JOptionPane.showMessageDialog(null, "Su balance de este mes ahora es de: " + balance.get(log).get(input), "Octa Wallet", JOptionPane.INFORMATION_MESSAGE);  
               break;
               
            //Caso en el que el usuario quiere retirar dinero.
            case 1:
               
                monthMenu();
                myBalance = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto dinero deseas retirar en la cuenta durante este mes?"));
                
                //Verifica que el usuario tenga fondos suficientes
                if (myBalance <= balance.get(log).get(input)){
                    myBalance = balance.get(log).get(input) - myBalance;
                    balance.get(log).set(input, myBalance);
                    JOptionPane.showMessageDialog(null, "Su balance de este mes ahora es de: " + balance.get(log).get(input), "Octa Wallet", JOptionPane.INFORMATION_MESSAGE);  
                }
                else{
                     JOptionPane.showMessageDialog(null, "Fondos insuficientes", "Octa Wallet", JOptionPane.INFORMATION_MESSAGE);  
                }
                
            break;
                
        }//cierre switch
    }//cierre método modifyBalance
    
    //Metodo que permite al usuario ver total de su cuenta.
    public static void viewBalance(){ 
        monthMenu();
        JOptionPane.showMessageDialog(null, "Su balance de este mes actualmente es de: " + balance.get(log).get(input), "Octa Wallet", JOptionPane.INFORMATION_MESSAGE);  
    }//Cierre método viewBalance
    
    //Metodo que grafica el dinero
    public static void resumenBalance(){
        
        System.out.println("█ = 10");
        for (int y = 0; y < 12; y++){
            System.out.print(y+1);
            if (y<9){
                System.out.print("   ");
            }
            else{
                System.out.print("  ");
            }
            for (int x = 0; x< balance.get(log).get(y) / 10; x++){
                System.out.print("█");
            }
            System.out.println();   
        }
    }//Cierre método resumenBalance
      
}//cierre clase  
   
   
    

