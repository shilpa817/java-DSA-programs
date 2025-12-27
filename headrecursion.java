class headrecursion
{
static int print(int n)
{
if(n==0)
{
return 0;
}
print(n-1);
System.out.println(n);
return (0);
}
public static void main(String[] args)
{
print(10);
}
}