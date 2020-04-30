#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,p,q,r,s;
  cin>>a>>b>>c>>d;
  p=a+c;
  q=b+d;
  if(q>100)
  {
    r=q-100;
    p=p+1;
  }
  else if(q>200)
  {
    r=q-200;
    p=p+2;
  }
  else
    r=q;
  cout<<p<<endl<<r;
}
