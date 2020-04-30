#include<iostream>
using namespace std;
int main()
{
  int p,r,y;
  std::cin>>p;
  std::cin>>r;
  std::cin>>y;
  float x,z,i,j;
  x=(p*r*y)/100;
  z=x*0.02;
  i=p+x;
  j=i-z;
  std::cout<<x<<endl<<i<<endl<<z<<endl<<j<<endl;
}