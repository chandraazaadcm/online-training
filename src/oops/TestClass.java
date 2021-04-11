package oops;

public class TestClass implements Inter1,Inter2,Inter3{
	int a=20;
	int b=10;
	int c;
	@Override
	public void mul() 
	{
		c=a*b;
		System.out.println(c);
	}
	@Override
	public void sub() 
	{
		c=a-b;
		System.out.println(c);
	}
	@Override
	public void add() 
	{
		
		c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		TestClass tc=new TestClass();
		tc.add();
		tc.sub();
		tc.mul();
	}
}
