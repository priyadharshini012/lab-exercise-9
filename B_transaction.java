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
public class B_transaction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ 
        
                debit_transact obj=new debit_transact();
        
        try
        {
            obj.balance_checker();
        }
        catch(debitexception d)
        {
            System.out.println(d);
        }
        
        
    }
    
}
class debit_transact
{
    Scanner val =new Scanner(System.in);
    double bankbalance=100000,debitamount;
    
    debit_transact()
    {
        System.out.println("Available bank balance:Rs."+bankbalance);
        System.out.println("Enter the amount to be debited:");
        debitamount=val.nextDouble();
    }
    
    void balance_checker() throws debitexception
    {       
        if(debitamount>bankbalance)
            throw new debitexception("Amount exceeds balance :-( !!");
        System.out.println("Amount debited successfully :-)  !!\nDebited amount:Rs."+debitamount+"/-\nAvailable balance after debit:Rs."+(bankbalance-debitamount));
         
    }
}

class debitexception extends Exception
{
    debitexception(String msg)
    {
        super(msg);
    }
}



