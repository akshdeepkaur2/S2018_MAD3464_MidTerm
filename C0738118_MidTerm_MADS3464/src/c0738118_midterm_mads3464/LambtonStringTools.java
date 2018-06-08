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
public class LambtonStringTools {
    static int l;
    static int c = 0;
    static int res;
    
    static void reverse( String s)
    {
            char ch[] = new char[s.length()];
            for(l = 0;l<s.length();l++)
            {
                ch[l] = s.charAt(l);
            }
    for(l=s.length() -1; l>=0; l--)
    {
        System.out.println(ch[l]);
    }
}
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
	
	
}
    public class Initials
{
    
 public void printInitials(String name)
    {
  if (name.length() == 0)
  return;
   System.out.print(Character.toUpperCase(
   name.charAt(0)));
       
  for (int i = 1; i < name.length() - 1; i++)
  if (name.charAt(i) == ' ')
  System.out.print(" " + Character.toUpperCase(name.charAt(i + 1)));
    }
 
    
}
}