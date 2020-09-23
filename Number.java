/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package b_transaction;

/**
 *
 * @author hp
 */
public class Number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
	 int num=Integer.parseInt ("XYZ") ;
	 System.out.println(num);
      }
        catch(NumberFormatException e){
	  System.out.println("Number format exception occurred");
       }
   }

    }
    

