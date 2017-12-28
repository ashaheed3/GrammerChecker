/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

import java.util.Scanner;

  

public class Quiz2 {
 
    /*Language
        L = {w : w is of the form A^nB^2n for some n ≥ 0}
      Grammer
        < legal-word > = empty string | A < legal-word > B| B
    */
    //Checks to see if user input is in language
    public static boolean isInLanguage(String userInput){
        
        //Base case
        if(userInput.isEmpty()){
            return true;
        }else if((userInput.startsWith("A") && userInput.endsWith("B"))){
            try{
            return isInLanguage(userInput.substring(1, userInput.length()-2));
            }catch(StringIndexOutOfBoundsException e){return false;}
        }else
            return false;
    }

    public static void main(String[] args) {
        
     
      Scanner in = new Scanner(System.in);
        
      System.out.println("Input String");
      String response = in.nextLine();
         
     
       System.out.println(isInLanguage(response.toUpperCase()));    
 
    }
    
    
}
