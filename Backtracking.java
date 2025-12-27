class Backtracking
{
	static void Subset(int []a,int index,int sum,int target,String p)
	{
		if(sum==target)
		{
			System.out.println(p);
			return;
		}
		if(index==a.length||sum>target)
            return;
         Subset(a,index+1,sum+a[index],target,p+a[index]+" ");
         Subset(a,index+1,sum,target,p);
    }
 public static void main(String args[])
 {
    int a[]={2,4,8,7,6,1};
    int target=8;
    Subset(a,0,0,target,"");
  }
 }
 