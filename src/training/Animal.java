package training;

public class Animal {
	double height=7.0;
	String city="Hyderabad";
	void dog()
	{
		double height=3.4;
		String city="bang";
		System.out.println("height of dog :"+height);
		System.out.println("height of the dog when jumps :"+this.height);
		System.out.println("city is :"+this.city);
	}
	public static void main(String[] args) {
		Animal a=new Animal();
		a.dog();
	}

}
