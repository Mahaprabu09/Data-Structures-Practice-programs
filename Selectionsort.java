package SortSearch;

import java.util.Arrays;

public class Selectionsort {
	static void Ssort(int array[])
	{
		int size=array.length;
		
		for(int i=0;i<size-1;i++)
		{
			int min_index=i;
			for(int j=i+1;j<size;j++)
			{
				if(array[j]<array[min_index])
				{
					min_index=j;
				}
			}
			int temp=array[i];
			array[i]=array[min_index];
			array[min_index]=temp;
			
		}
	
		
	}
	
	

	public static void main(String[] args) {
		int array[]= {23,55,1,55,23,67,33,2};
		Selectionsort ss=new Selectionsort();
		ss.Ssort(array);
		System.out.println("Sorted selectionsort elements");
		System.out.println(Arrays.toString(array));
	
	}

}
