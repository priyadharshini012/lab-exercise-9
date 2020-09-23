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
public class string {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
	 String str="welcometojava";
	 System.out.println(str.length());;
	 char c = str.charAt(0);
	 c = str.charAt(40);
	 System.out.println(c);
         }
        catch(StringIndexOutOfBoundsException e){
	  System.out.println("StringIndexOutOfBoundsException!!");
       }
   }

    }
    
}
