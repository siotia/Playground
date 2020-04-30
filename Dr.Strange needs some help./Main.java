#include<iostream>
using namespace std;
int aa(int a,int b);
int main()
{
  int m,n,r,z;
  cin>>m>>n>>r;
  z=aa(m,n);
  if(r<=z)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
  return 0;
}
int aa(int a,int b)
{
  int i,p;
  p=a;
  for(i=1;i<b;i++)
  {
    p=p*a;
  }
  return p;
}