class lexicographical
{
static void lexicograph(int current,int n)
{
if(current>n)
{
return;
}
System.out.println(current +" ");
for(int i=0;i<=9;i++)
{
int next=current*10+i;
if(next>n)
{
return;
}
lexicograph(next,n);
}
}
public static void main(String[] args)
{
int n=13;
for(int i=1;i<=9;i++)
{
lexicograph(i,n);
}
}
}