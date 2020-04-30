#include<iostream>
using namespace std;
int sum(int a);
int main()
{
  int n;
  cin>>n;
  while(n>9)
  {
    n=sum(n);
  }
  cout<<n;
  return 0;
}
int sum(int a)
{
  int x=0,y;
  while(a!=0)
  {
  y=a%10;
  x=x+y;
  a=a/10;
  }
  return x; 
}