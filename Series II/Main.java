#include<iostream>
using namespace std;
int main()
{
  int n,a=121,i;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cout<<a<<" ";   
    a=a+104+i*32;
  }
}
