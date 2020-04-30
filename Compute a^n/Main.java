#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b=1,i,n;
  cout<<"Enter the value of a\nEnter the value of n\n";
  cin>>a>>n;
  for(i=0;i<n;i++)
  {
    b=b*a;
  }
  cout<<"The value of "<<a<<" power "<<n<<" is "<<b;
  return 0;
}