package Sorting;
public class sort 
{ 
	public static void main(String[] args) 
	{ 
		int[] a = {15,9,60,44,12,1,4}; 
		
	} 
	void ExamSort(int a[], int size) 
	{ 
			size = a.length; 
		for (int x=1; x<size; ++x) 
		{ 
			int element = a[x]; 
			int y = x-1; 

			while (y>=0 && a[y] > element) 
			{ 
				a[y+1] = a[y]; 
				y = y-1; 
			} 
			a[y+1] = element; 
		
		System.out.print(a[x] + " "); 
		}
	} 

	
	static void printArray(int a[]) 
	{ 
		int size = a.length; 
		for (int x=0; x<size; ++x) 

		System.out.println(); 
	} 
	} 



