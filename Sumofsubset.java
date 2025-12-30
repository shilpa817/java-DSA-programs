class Sumofsubset
{
 static boolean subset(int[]a,int n,int target)
 {
  if(target==0)
  {
   return true;
  }
  if(n==0)
  {
   return false;
  }
  if(a[n-1]>target)
  {
     return subset(a,n-1,target);
  }
  return subset(a,n-1,target)||subset(a,n-1,target-a[n-1]);
  
 }
 public static void main(String ags[])
 {
  int[]a={2,5,8,6,3,4};
  int target=9;
  System.out.println(subset(a,a.length,target));
}
}