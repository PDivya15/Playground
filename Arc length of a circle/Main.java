#include<stdio.h>
#include<math.h>
int main()
{float r,c,area;
 scanf("%f%f",&r,&c);
 area=2*3.14*r*(c/360);
 printf("%.2f",area);
 return 0;
}