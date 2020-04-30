#include<iostream>
int main()
{
  int a,b,c,i=1,sum=0;
  std::cin>>a>>b;
  c=a+b;
  while(i<c)
  {
    if(c%i==0)
      sum=sum+i;
      i++;
  }
  if(sum==c)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
}