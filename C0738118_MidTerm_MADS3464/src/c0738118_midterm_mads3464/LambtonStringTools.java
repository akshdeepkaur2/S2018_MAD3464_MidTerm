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
}