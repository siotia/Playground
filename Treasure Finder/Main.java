#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,hcf=1,i;
  cin>>a>>b>>c;
  if(a>=b && a>=c)
  {
    if(b>=c)
      cout<<"The treasure is in box which has number "<<b<<endl;
    else
      cout<<"The treasure is in box which has number "<<c<<endl;
  }
  else if(b>=a && b>=c)
  {
    if(a>=c)
      cout<<"The treasure is in box which has number "<<a<<endl;
  	else
      cout<<"The treasure is in box which has number "<<c<<endl;
  }
  else if(a>=b)
      cout<<"The treasure is in box which has number "<<a<<endl;
  else
      cout<<"The treasure is in box which has number "<<b<<endl;
  d=a*b*c;
  for(i=2;i<=d;i++)
  {
    if(a%i==0 && b%i==0 && c%i==0)
    {
      hcf=i;
      break;
    }
  }
  cout<<"The code to open the box is "<<hcf;
}