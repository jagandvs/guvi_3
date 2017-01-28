#include <iostream>

using namespace std;

int main()
{
    int i,sum=0,sum_o=0,n;
    for(i=1;i<=15;i++)
        sum=sum+i;
    cout<<"The sum of 1 to 15 numbers are  "<<sum<<"\n";
    for(n=15;n<=45;n++)
    {
        if(n%2!=0)
            sum_o=sum_o+n;
    }

    cout<<"The sum of 15 to 45 odd numbers is  "<<sum_o;
    return 0;
}

