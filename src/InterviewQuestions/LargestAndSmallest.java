package InterviewQuestions;

public class LargestAndSmallest {
public static void main(String[] args) {
	int numbers[]= {-11,22,88,-80,123};
	int largest=numbers[0];
	int smallest=numbers[0];
	for(int i=1;i<numbers.length;i++)
	{
		if(numbers[i]>largest)
		{
			largest=numbers[i];
		}
		else if(numbers[i]<smallest)
			
		{
			smallest=numbers[i];
		}
	}
	System.out.println("Largest number is:"+largest);
	System.out.println("smallest number is:"+smallest);
	
	
}
}
