package Main;

import java.util.Arrays;
import java.util.Random;

public class Array {
	
	private int[] array;
	
	
	public Array() 
	{
		
	}
	
	
	public Array(int number)
	{
		this.array= new int [number];
	
	}
	
	
	public int[] getArray() 
	{
		return this.array;
	}
	
	public void setArray(int[] input) 
	{
		this.array=input;
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
	
	
	public int[] quickSort() 
	{
		quicksort(0, this.array.length - 1);
		return this.array;
	}
	
	
	private void quicksort(int low, int high) {
        int i = low;
        int j = high;

        
        int pivot = this.array[low + (high - low) / 2];

        
        while (i <= j) {
          
            while (this.array[i] < pivot) {
                i++;
            }
            while (this.array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }

        if (low < j) {
            quicksort(low, j);
        }

        if (i < high) {
            quicksort(i, high);
        }
    }

	
	private void swap(int i, int j) {
        int temp = this.array[i];
        this.array[i] = this.array[j];
        this.array[j] = temp;

	}
	
	
	public int[] countingSort() 
	{
		int max=this.array[0];
		int	min=this.array[0];
		
		for(int i=0;i<this.array.length;i++) 
		{	
			if(this.array[i]>max)
				max=this.array[i];
			
			if(this.array[i]<min)
				min=this.array[i];
		}
		
		int[] counts = new int[max - min + 1];
		
		for (int i = 0;  i < array.length; i++) {
		      counts[array[i] - min]++;
		 }
		
		 counts[0]--;
	    
		for (int i = 1; i < counts.length; i++) {
	      counts[i] = counts[i] + counts[i-1];
	    }
	    
	    int[] output= new int[this.array.length];
	    
	    
	    for (int i = this.array.length - 1; i >= 0; i--) {
	        output[counts[this.array[i] - min]--] = this.array[i];
	    }
		this.array=output;
		return this.array;
	}

	



	
	
}
