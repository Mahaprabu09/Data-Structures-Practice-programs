package SortSearch;

import java.util.Arrays;

public class Bubblesort {
	static void bubblesort(int array[])
	{
		int size=array.length;
		
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int[] num= {33,22,5,21,66,20,36};
		Bubblesort.bubblesort(num);
		
		System.out.println("Sorted array in acending order:"+Arrays.toString(num));
	}

}
