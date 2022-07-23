#include<bits/stcc++.h>
using namespace std

int main()
{
 int n;
 cin>>n;
 int arr=[n][n];
 for(int i=0;i<n;i++)
 {
    for(int j=0;j<n;j++)
    {
        cin>>arr[i][j];
    }
 }
 int suml=0;
 int sumr=0;
 for(int i=0;i<n;i++)
 {
    for(int j=0;j<n;j++)
    {
    if(i==j)
      {
        suml=suml+arr[i][j];
      }
    }
 }
 i=0;
 j=n-1;
 while(i!=n && j>=0)
 {
  sumr=sumr+arr[i][j];
  i++;
  j--;
 }
 
 count<<abs(suml-sumr);
}
