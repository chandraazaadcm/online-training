package training;

import java.util.Scanner;

public class ScannerProg {
int a,b,c;
Scanner s=new Scanner(System.in);
	public void add()
	{
		System.out.println("enter first number");
		a=s.nextInt();
		System.out.println("enter second nuber");
		b=s.nextInt();
		c=a+b;
		System.out.println("Addition is :"+ c);
	}
     public void sub()
	{
	}
	

public static void main(String[] args)
{
ScannerProg sp=new ScannerProg();
sp.add();
}
}
