#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int x,sum,z;
  float n,y;
  cin>>x;
  sum=0;
  y=sqrt(x);
  n=x*(1/y);
  z=x+n;
  cout<<z+1;
}