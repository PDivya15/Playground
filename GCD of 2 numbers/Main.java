// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()

{
   int x, y, i, gcd;

  // printf("Enter two integer values: \n");
   scanf("%d %d", &x, &y);

   for (i = 1; i <= x && i <= y; i++)\
   {
      if (x % i == 0 && y % i == 0)
         gcd = i;
   }

   printf("%d",gcd);

   return 0;
}
  /*
  int a,b,gcd,i;
 scanf("%d%d" ,&a,&b);
 for(i=0;i<=a && i<=b;i++)
 {if(a%i==0 && b%i==0)
   gcd=i;
 }
 printf("%d",gcd);

   
  // Enter your code here 
  
   return 0;
}*/