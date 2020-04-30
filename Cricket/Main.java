#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a,d,b,c;
  std::cin>>a>>b>>c>>d;
  float g,h,f,e=50;
  f=(d/6)+((d%6)*0.1);
  g=c/f;
  h=b/e;
  std::cout<<e<<endl<<f<<endl;
  std::cout<<fixed<<setprecision(1)<<g<<endl;
  std::cout<<h<<endl;
  if(g>h)
    std::cout<<"Eligible to Win";
  else
    std::cout<<"Not Eligible to Win";
}