class selectionSort
{
	public static void main(String[]args)
	{
		int[]a={2,5,3,8,1,9};
		for(int i=0;i<a.length-1;i++)
		{
			int  min=i;
			for(int j=i;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
            }
           int temp=a[i];
           a[i]=a[min];
           a[min]=temp;
		}
       for(int num:a)
       {
       System.out.println(num);
       }
    
   }
}