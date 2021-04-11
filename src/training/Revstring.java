package training;

import java.util.Scanner;

public class Revstring {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter your name:");
		String name=s.nextLine();
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println("reverse of your name:"+rev);
	}

}
