/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package b_transaction;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class arth_exp{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              try{
         int num1=30, num2=0;
         int output=num1/num2;
         System.out.println ("Result: "+output);
      }
      catch(ArithmeticException e){
         System.out.println ("You Shouldn't divide a number by zero");
      }

        // TODO code application logic here
        
        
    }

           

    }
    

