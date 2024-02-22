package JavaTraining;

//comments  from team member
public class AddNumbersInGivenNumber {

	//add method
	public void add(int a)
	{
		System.out.println("Given number :"+ a);
		
		int result = 0;
		while(a>0)
		{
			result = result + a%10;
			//result += a%10;
			a=a/10;
			
		}
		System.out.println(result);
		
	}
	
	//main method more comments
	public static void main(String[] args) {
		
		
		AddNumbersInGivenNumber obj = new AddNumbersInGivenNumber();
		obj.add(143);

	}

}
