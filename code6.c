#include<stdio.h>
int main()
{
	int n;
	printf("Enter value of n ");
	scanf("%d",&n);
	for(int i=0;i<=n;i++)
	{
		printf("%d \n",rand()%10+20);
		//Here 10 is the difference between range
		//And 20 is the starting of range (20,30 not included)
	}
}
