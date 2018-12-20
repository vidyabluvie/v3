import java.io.*;
class odd
{
public static void main(String args[])
{
DataInputStream d=new DataInputStream(System.in);
System.out.println("Enter the initial interval number:");
int m=d.readLine();
System.out.println("Enter the final interval number:");
int n=d.readLine();
for(int num=m;num<=n;num++)
{
if(num%2==1)
{
System.out.println(num);
}
}
}
}
