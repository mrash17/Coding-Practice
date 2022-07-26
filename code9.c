//LCM 
//Method 1
#include <stdio.h>
void main()
{
  int n1,n2;
  scanf("%d %d",&n1,&n2);
  int gcd,lcm;
  for(int i=1;i<=n1 && i<=n2;i++)
  {
    if(n1%i==0 && n2%i==0)
    {
      gcd=i;
    }
  }
  lcm=n1*n2/gcd;
}

//Method 2

#include <stdio.h>
void main()
{
  int n1,n2;
  scnaf("%d %d",&n1,&n2);
  int max=(n1>n2)?n1:n2;
  while(1)
  {
    if((max%n1==0) &&(max%n2==0))
    { printf("The LCM is %d",max);
      break;
    }
    max++;
  }
  
}
