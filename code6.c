#include<stdio.h>
int main()
{
	int n;
	printf("Enter value of n ");
	scanf("%d",&n);
	for(int i=0;i<=n;i++)
	{
		printf("%d \n",rand()%10+20);
	}
}
