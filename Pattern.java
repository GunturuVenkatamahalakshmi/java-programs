class Spattern
{
public static void main(String args[])
{
int n=5;
for(int i=1;i<=n;i++)
{ 
   for(j=2*(n-i);j>=0;j--)
{
System.out.println("");
}
for(int j=0;j<i;j++)
{
System.out.print("* ");
}
System.out.println();
}
}
}