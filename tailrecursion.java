class tailrecursion
{
static int print(int n)
{
if(n==0)
{
return 0;
}
System.out.println(n);
print(n-1);
return (0);
}
public static void main(String[] args)
{
print(10);
}
}