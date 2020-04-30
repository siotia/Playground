#include<iostream>
using namespace std;
int main()
{
  int a,b;
  std::cin>>a;
  if(a<=200)
  {
    a=a*0.5;
    std::cout<<"Rs."<<a;
  }
  else if(a<=400)
  {
    a=(a*0.65)+100;
    std::cout<<"Rs."<<a;
  }
  else if(a<=600)
  {
    a=(a*0.8)+200;
    std::cout<<"Rs."<<a;
  }
  else if(a<600)
  {
    a=(a*1.25)+425;
    std::cout<<"Rs."<<a;
  }
}