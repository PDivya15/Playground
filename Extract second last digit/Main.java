#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  n=((n%1000)/10)%10;
  printf("%d",n);
  //Type your code here
  return 0;
}