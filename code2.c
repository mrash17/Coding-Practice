#include <stdio.h>
int main()
{


int p1,p2,p3,q,e,r;
scanf("%d %d %d %d %d %d",&p1, &p2, &p3, &q, &e, &r);
int x=(e-r+2*q-p1-p2-p3)/3;
int first=x+p1-q+q+p3-q;
printf("%d ",first);
printf("%d", x*3);

}
