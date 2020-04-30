#include<iostream>
using namespace std;
int main()
{
  float a;
  int b,c;
  std::cin>>a>>b>>c;
  if((c/a)<=b)
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
}