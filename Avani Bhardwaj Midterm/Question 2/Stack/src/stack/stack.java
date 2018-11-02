package stack;

public class stack 
{ 
	 public static void main(String args[]) 
	 { 
	     stack array = new stack(); 
	     array.add(0); 
	     array.add(10); 
	     array.add(5); 
	     array.add(4); 
	     array.add(9); 
	     array.add(1);  
	     System.out.println(array.remove() + " removed from stack"); 
	 } 
	int maxValue = 10; 
    int head; 
    int a[] = new int[maxValue]; 
   
    boolean setEmpty() 
    { 
        return (head < 0); 
    } 
    stack() 
    { 
        head = -1; 
    } 
  
    int remove() 
    { 
        if (head < 0) 
        { 
        return 0; 
        } 
        else
        { 
            int x = a[head--]; 
        return x; 
        } 
    } 
    boolean add(int x) 
    { 
        if (head >= (maxValue-1)) 
        { 
        return false; 
        } 
        else
        { 
            a[++head] = x; 
            System.out.println(x + " added into stack"); 
            return true; 
        } 
    } 
} 
  

