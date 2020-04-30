#include<iostream>
using namespace std;
int main()
{
  int a[50]={2,6,6,10,10,14,14,18,18,22,24},n,i,k=0;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cout<<k<<" ";
    k=k+a[i];
  }
}