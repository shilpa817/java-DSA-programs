class combination3
{
 static void combination(int[]a,int index,int target,int k,String p)
 {
  if(target==0&&k==0)
  {
   System.out.println(p);
   return;
  }
  if(target<0||k<0)
  {
   return;
  }
  for(int i=index;i<a.length;i++)
  {
   combination(a,i+1,target-a[i],k-1,p+a[i]+",");
  }
 }
 public static void main(String []args)
 {
  int[] a={2,3,5,6,7,2};
  int target=9;
  int k=2;
  combination(a,0,target,k," ");
 }
}