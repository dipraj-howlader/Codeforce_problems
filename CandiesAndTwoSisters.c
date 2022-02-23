// solved in March 15,2020 in C

#include<stdio.h>
 
int main(void)
{
    int t , n;
 
    scanf("%d",&t);
     for(int i=1;i<=t;i++)
     {
         scanf("%d",&n);
         if(n%2==0)
         {  int q;
             q=(n/2)+1;
             printf("%d\n", n-q);
         }
         else{
            int s;
            s= ((n/2));
            printf("%d\n",s);
         }
     }
     return 0;
}

