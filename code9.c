//LCM
#include <stdio.h>
void main()
{
  int n1,n2;
  scnaf("%d %d",&n1,&n2);
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
