/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0738118_midterm_mads3464;

/**
 *
 * @author Dhillon Huni
 */
public class C0738118_MidTerm_MADS3464 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*{
        LambtonStringTools lst = new LambtonStringTools();
        lst.reverse("lambton");*/
    
		BinaryToDecimal obj = new BinaryToDecimal();
		
		System.out.println("Decimal of 1101 : "+obj.binaryToDecimal(1101));
		System.out.println("Decimal of 111101 : "+obj.binaryToDecimal(111101));
	}
	
}
