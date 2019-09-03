#include <stdio.h>
void main()
{
   int i,n,sum=0;
   scanf("%d\n",&n);
   for(i=1;i<=n;i++)
   {
     printf("%d\n",2*i-1);
     sum+=2*i-1;
   }
   
}


