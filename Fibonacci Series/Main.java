#include<iostream>
using namespace std;
int main()
{
  int t1=0,t2=1,nt,i,n;
  cin>>n;
  for(i=1;i<(n-1);i++)
  {
    nt=t1+t2;
    t1=t2;
    t2=nt;
  }
  cout<<"The term "<<n<<" in the fibonacci series is "<<nt;
  return 0;
}