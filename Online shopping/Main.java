#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f,g,h,i,j,k,l;
  std::cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  j=(a-(a*b/100)+c);
  k=(d-(d*e/100)+f);
  l=(g-(g*h/100)+i);
  if(j<=k && j<l)
    std::cout<<"In Flipkart Rs."<<j<<endl<<"In Snapdeal Rs."<<k<<endl<<"In Amazon Rs."<<l<<endl<<"He will prefer Flipkart";
  else if(k<l)
    std::cout<<"In Flipkart Rs."<<j<<endl<<"In Snapdeal Rs."<<k<<endl<<"In Amazon Rs."<<l<<endl<<"He will prefer Snapdeal";
  else
    std::cout<<"In Flipkart Rs."<<j<<endl<<"In Snapdeal Rs."<<k<<endl<<"In Amazon Rs."<<l<<endl<<"He will prefer Amazon";
}