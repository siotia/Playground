#include<iostream>
using namespace std;
int main()
{
  int i,n,s=0,x=1,t;
  cin>>n;
  for(i=1;i<n;i++)
  {
    t=s+x;
    s=x;
    x=t; 
  }
  cout<<s;
}