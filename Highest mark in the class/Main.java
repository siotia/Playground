#include<iostream>
using namespace std;
int main()
{
  int n,i,a[50],h;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  h=a[0];
  for(i=0;i<n;i++)
  {
    if(a[i]>h)
    {
      h=a[i];
    }
  }
  cout<<h;
  return 0;
}