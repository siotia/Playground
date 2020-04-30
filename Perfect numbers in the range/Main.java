#include<iostream>
using namespace std;
bool perfectsquare(int n)
{
  int s=0;
  for(int i=1;i<n;i++)
    if(n%i==0)
      s+=i;
  if(s==n)
    return true;
  else
    return false;
}

int main()
{
  int n,m;
  cin>>n>>m;
  for(int i=n;i<m;i++)
  	if(perfectsquare(i))
    	cout<<i<<" ";
  return 0;
}