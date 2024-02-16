package JavaTraining;

public class SortArrayItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= {7,4,6,8,1,3,5,2};
		System.out.println("Before sorting");
		System.out.println("---------------");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]+" ");
		} 
		
		System.out.println("After sorting");
		System.out.println("---------------");
		int temp;
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]+" ");
		}
	}

}
