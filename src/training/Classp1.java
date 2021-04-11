
package training;

public class Classp1 {
	int a=20;
	int b=10;
	int c;
	public void add()
	{
		c=a+b;
		System.out.println(c);
	}
public void sub()
{
	c=a-b;
	System.out.println(c);
}
public void mul()
{
	c=a*b;
	System.out.println(c);
}
public void div()
{
	c=a/b;
	System.out.println(c);
}
public static void main(String[]args)
{
Classp1 cp =new Classp1();
cp.add();
cp.sub();
cp.mul();
cp.div();
}
}
