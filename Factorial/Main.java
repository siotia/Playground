#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a=1,i,n;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    a=a*i;
  }
  cout<<"The factorial of "<<n<<" is "<<a;
  return 0;
}