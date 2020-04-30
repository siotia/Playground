#include <iostream>
using namespace std;
int main()
{
  int n,i,a=0;
  cin>>n;
  if (n==1)
  {
    cout<<"Not eligible";
    return 0;
  }
  for(i=2;i<=n/2;i++) 
   {
    if(n%i==0)
    {
      a=1;
      break;
    }
  }
  if (a==0)
    cout<<"Eligible";
  else
    cout<<"Not eligible";
}
    