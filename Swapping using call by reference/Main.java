#include<iostream>
using namespace std;
int main()
{
  int c,a,b;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and b="<<b;
  c=a;
  a=b;
  b=c;
  cout<<"\nAfter swapping a= "<<a<<" and b="<<b;
  return 0;
}