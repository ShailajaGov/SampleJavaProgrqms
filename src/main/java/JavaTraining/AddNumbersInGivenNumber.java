package JavaTraining;

public class AddNumbersInGivenNumber {

	
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddNumbersInGivenNumber obj = new AddNumbersInGivenNumber();
		obj.add(143);

	}

}