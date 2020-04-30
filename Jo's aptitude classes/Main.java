#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f,g,h,i;
  cin>>a>>b>>c>>d;
  e=(a>b?b:a);
  f=(e>c?c:e);
  while(f>0)
  {
  	if(a%f==0 && b%f==0 && c%f==0)
    {
      g=f;
      break;
    }
    f--;
  }
  if(f==d)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
  
return 0;
}