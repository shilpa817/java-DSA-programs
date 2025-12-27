class towerofhanoi
{
static void towerofhanoi(int n,char source,char helper,char destination)
{
if(n==1)
{
System.out.println("move the 1 from" +source+ "to" + destination);
return;
}
towerofhanoi(n-1,source,destination,helper);
System.out.println("move the" +n+ "from" +source+ "to" + destination);
towerofhanoi(n-1,helper,source,destination);
}
public static void main(String[] args)
{
int n=3;
towerofhanoi(n,'A','B','C');
}
}