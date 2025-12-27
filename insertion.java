class insertion
{
public static void main(String[] args)
{
int[] a={5,3,8,4,6,7};
for(int i=1;i<a.length;i++)
{
int k=a[i];
int j=i-1;
while(j>=0 && a[j]>k)
{
a[j+1]=a[j];
j--;
}
a[j+1]=k;
} 
for(int b:a)
{
System.out.println(b);
}
}
}