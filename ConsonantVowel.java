/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rhart
 */
 import java.util.Scanner;
public class ConsonantVowel {

   public static void main(String[ ] arg)
   {
	boolean isVowel=false;;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a character : ");
	char ch=scanner.next().charAt(0); 
	scanner.close();
	switch(ch)
	{
	   case 'a' :
	   case 'e' :
    	   case 'i' :
	   case 'o' :
	   case 'u' :
	   case 'A' :
	   case 'E' :
	   case 'I' :
	   case 'O' :
	   case 'U' : isVowel = true;
	}
	if(isVowel == true) {
	   System.out.println(ch+" is  a Vowel");
	}
	else {
	   if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println(ch+" is a Consonant");
	   else
		System.out.println("Input is not an alphabet");		
        }
   }
}
