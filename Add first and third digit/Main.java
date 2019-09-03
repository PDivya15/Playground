#include<stdio.h>
int main()
{
  int num,n1,n2,sum;
  scanf("%d",&num);
 n2 = num % 10;
    n1 = num;
    while(num >= 10)
    {
        num = num / 10;
    }
  n1 = num;
    sum = n1 + n2; 
  printf("%d",sum);

  return 0;
}
