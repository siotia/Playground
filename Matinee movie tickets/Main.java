#include<iostream>
using namespace std;
int main()
{
  int a;
  float t;
  std::cin>>a>>t;
  if(a>13 && t<13.30)
    std::cout<<"$8.00";
  else if(a>13 && t>13.30)
    std::cout<<"$5.00";
  else if(a<13 && t<13.30)
    std::cout<<"$4.00";
  else if(a<13 && t>13.30)
    std::cout<<"$2.00";
}