#include<iostream>
#include<cmath>
int length(int n)
{
  int i;
  for(i=0;n;i++,n=n/10);
  return i;
}
using namespace std;
int main()
{
  int n;
  cin>>n;
  int sq=n*n;
  int r=length(n);
  int l=pow(10,r);
  if(sq/l+sq%l==n)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
}