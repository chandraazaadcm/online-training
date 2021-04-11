package training;

public class Cal {
	int a=10;
	int b=5;
	int c;
	void add()
	{
		c=a+b;
		System.out.println("addition is :"+c);
	}
	void sub()
	{
		c=a-b;
		System.out.println(c);
	}
void mul()
{
	c=a*b;
	System.out.println(c);
}
void div()
{
	c=a/b;
	System.out.println(c);
}
public static void main(String[] args) {
	Cal c=new Cal();
	c.add();
	c.sub();
	c.mul();
	c.div();
}
}
