#include<iostream>
using namespace std;
int main() 
{
  int i,j,n;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      if(j<i)
        cout<<i<<"*";
      else
        cout<<i;
    }
    cout<<endl;
  }
  for (i=n;i>=1;i--)
  {
    for (j=1;j<=i;j++)
    {
      if(j<i)
        cout<<i<<"*";
      else
        cout<<i;
    }
    cout<<endl;
  }
  return 0;
}