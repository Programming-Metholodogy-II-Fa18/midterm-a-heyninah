package problemthree;

public class SSort {

	 public static void main(String args[]) 
	 { 
			int[] a = {1, 5, 8, 10, 12, 14, 18, 20, 33, 41}; 
			
		} 
		void ProblemThree(int a[], int size) 
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
