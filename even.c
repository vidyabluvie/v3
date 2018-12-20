#include<stdio.h>
#include<conio.h>
int m,n,num,i;
void main()
{
printf("\nEnter the starting value for interval:");
scanf("%d",&m);
printf("\nEnter the final value for interval:");
scanf("%d",&n);
for(num=m;num<=n;num++)
{
if(num%2==0)
{
printf("%d",num);
}
}
getch();
}
