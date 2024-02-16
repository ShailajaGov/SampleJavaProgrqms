package JavaTraining;

import java.util.ArrayList;

public class BubbleSortAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(7);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(2);
		
		System.out.println(list);
		
		bubbleSort(list);
		
		System.out.println(list);
	}

	private static void bubbleSort(ArrayList<Integer> list) {
	
		boolean swap=true;
		int temp;
		do {
			swap=false;
			for(int i=0;i<list.size()-1;i++)
			{
				if(list.get(i)>list.get(i+1)) 
				{
					temp=list.get(i);
					list.set(i, list.get(i+1));
					list.set(i+1,temp);
					swap=true;
				}
			}
			
		}
		while(swap);
	}

}
