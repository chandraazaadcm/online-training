package oops;

public class Abstract2 extends Abstract1 {

	@Override
	public void add()
	{
		c=a+b;
		System.out.println(c);
	}
	@Override
	public void sub()
	{
		c=a-b;
		System.out.println(c);
	}

public static void main(String[] args) {
	Abstract2 abs=new Abstract2();
	abs.add();
	abs.mul();
	abs.sub();
}
}
