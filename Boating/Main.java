#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  std::cin>>a>>b>>c;
  b=b*75;
  c=c*30;
  if(c+b<=a)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}