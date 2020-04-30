#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,i,n;
  cin>>a>>b;
  c=(a<b?a:b);
  for(i=c;i>1;i--)
  {
    if(a%i==0 && b%i==0)
    {
      cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<i;
      return 0;
    }
  }
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<1;
  return 0;
}