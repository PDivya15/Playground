#include<stdio.h>

void main()
{
long long int n,num,q,array[100000]={0};
scanf("%d",&n);
for(int i=0;i<n;i++)
{
scanf("%d",&num);
array[num]++;
}
scanf("%d",&q);
for(int i=0;i<q;i++)
{
scanf("%d",&num);
if(array[num]>0)
{
printf("%d\n",array[num]);
}
else
{
printf("NOT PRESENT\n");
}
}

}
