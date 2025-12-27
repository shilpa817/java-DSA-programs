package cseproject;

public class Quicksort {
	static void quicksort(int[] a,int left,int right)
	{
		if(left<right)
		{
			int pivot = partition(a, left ,right);
			
			quicksort(a,left,pivot-1);
			quicksort(a,pivot+1,right);
		}
	}
    static int partition(int[]a,int left,int right)
    {
    	int pivot=a[right];
    	int i=left-1;
    	
    	for(int j=left;j<right;j++)
    	{
    		if(a[j]<=pivot)
    		{
    			i++;
    			int temp=a[i];
    			a[i]=a[j];
    			a[j]=temp;
    		}
    	}
    	    int temp=a[i+1];
    	    a[i+1]=a[right];
    	    a[right]=temp;
    	 return i + 1;
    	
    }
    public static void main(String arghs[])
    {
    	int[]a= {5,1,9,7,3,4,2};
    	
    	quicksort(a,0,a.length-1);
    	for(int ab:a)
    	{
    		System.out.println(ab);
    	}
    }
}
 
