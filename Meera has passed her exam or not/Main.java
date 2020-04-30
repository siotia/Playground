#include<iostream>
using namespace std;
int main()
{
  int a[50],n,i,c;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cin>>c;
  for(i=0;i<n;i++)
  {
    if(a[i]==c)
    {
      cout<<"She passed her exam";
      return 0;
    }
  }
  cout<<"She failed";
  return 0;
  // Type your code here
}