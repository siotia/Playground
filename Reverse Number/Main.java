#include <iostream>
int main() 
{
  int n,rev=0,rem=0;
  std::cin>>n;
  while(n>0)
  {
    rem=n%10;
    n=n/10;
    rev=rev*10+rem;
  }
  std::cout<<rev;
  return 0;
}