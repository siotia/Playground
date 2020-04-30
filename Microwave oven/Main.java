#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a;
  float b;
  cin>>a>>b;
  if(a==2)
    cout<<fixed<<setprecision(2)<<(0.5*b)+b;
  else if(a==3)
    cout<<fixed<<setprecision(2)<<b*2;
  else
    cout<<"Number of items is more";
}