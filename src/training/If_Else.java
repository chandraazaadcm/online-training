package training;

import java.util.Scanner;

public class If_Else {
	int number;
	Scanner s=new Scanner(System.in);
	void isEven()
	{
		System.out.println("enter number :");
		number=s.nextInt();
		if(number%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
	}
	public static void main(String[] args) {
		If_Else ie=new If_Else();
		ie.isEven();
		
	}

}
