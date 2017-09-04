package Main;

import java.util.Arrays;
import java.util.Random;

public class Array {
	
	private int[] array;
	
	
	public Array(int number)
	{
		this.array= new int [number];
		array[0]=1;
		array[1]=2;
	}
	
	
	public int[] getArray() 
	{
		return this.array;
	}
	
	public int[] randomNumbers(int minVal,int maxVal) 
	{
		Random ran= new Random();
		for(int i=0;i<array.length;i++) 
		{
			array[i]=ran.nextInt(minVal)+(maxVal-minVal);
		}
		return this.array;
	}
	
	
	public int[] sortedByFinishedMethod() 
	{
		Arrays.sort(array);
		return this.array;
	}


	public int[] bubbleSort() 
	{
		
		for(int i=this.array.length-1;i>1;i--) 
		{
			for(int j=0;j<i;j++) 
			{
				if(this.array[j]>this.array[j++]) 
				{
					this.array[j]+=this.array[j+1];
					this.array[j+1]=this.array[j]-this.array[j+1];
					this.array[j]=this.array[j]-this.array[j+1];
				}
			}
		}
		return this.array;
	}
	 
	public int[] insertSort() 
	{   int temp;
		int j;
		for(int i=1;i<this.array.length;i++) 
		{
			j=i-1;
			temp=this.array[i];
			while(j>=1 && this.array[j]>temp) 
			{
				this.array[j+1]=this.array[j];
				j=j-1;
			}
			this.array[j]=temp;
		}
		return this.array;
	}
	
	
	
}
