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



   public class BinaryToDecimal {

	public int binaryToDecimal(int binary)
	{
	int decimal = 0;
	int power = 0;
		
	while(true){
	if(binary == 0){
	break;
	} 
	else {
	int temp = binary%10;
	decimal += temp*Math.pow(2, power);
	binary = binary/10;
	power++;
	}
	}
	return decimal;
	}
	
	public static void main(String args[])
	{
		BinaryToDecimal obj = new BinaryToDecimal();
		
		System.out.println("Decimal of 1101 : "+obj.binaryToDecimal(1101));
		System.out.println("Decimal of 111101 : "+obj.binaryToDecimal(111101));
	}
	
}