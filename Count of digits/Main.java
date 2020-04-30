#include<iostream>
int main()
{
  int a,b=0,c;
  std::cin>>a;
  do
  {
    a=a/10;
    b++;
  }while(a!=0);
  std::cout<<b;
}