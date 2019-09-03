#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  int sd;
  while(n>100)
  {
    n=n/10;
  }
  sd=n%10;
  printf("%d",sd);
  
	//Type your code
	return 0;
}