#include<iostream>
using namespace std;
int main()
{
  int n,i;
  cin>>n;
  while(n!=1)
  {
    cout<<n<<endl;
    if(n%2)
      n=3*n+1;
    else
      n=n/2;
    i++;
  }
  cout<<n<<endl<<i;
}