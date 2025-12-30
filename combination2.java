import java.util.Arrays;
class combination2
{
 static void combination(int[]a,int index,int target,String p)
 {
 if(target==0)
 {
  System.out.println(p);
  return;
 }
 for(int i=index;i<a.length;i++)
 {
  if(i > index && a[i] == a[i-1])
  {
   continue;
  }
  if(a[i] > target)
  {
   break;
  }
  combination(a,i+1,target-a[i],p+a[i]+",");
 }
}
public static void main(String args[])
{
 int[]a={2,4,8,7,6,1};
 Arrays.sort(a);
 int target=8;
 combination(a,0,target," ");
}
}