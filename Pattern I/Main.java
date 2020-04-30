#include<iostream>
using namespace std;
int main()
{
  int i,j,n;
  cin>>n;
  for(i=1;i<5;i++)
  {
    for(j=1;j<=i;j++)
    {
      cout<<n;
    }
    cout<<"\n";
    n=n+1;
  }
  n=n-1;
  for(i=4;i>0;i--)
  {
    for(j=1;j<=i;j++)
    {
      cout<<n;
    }
    cout<<"\n";
    n=n-1;
  }
      
  
  
}