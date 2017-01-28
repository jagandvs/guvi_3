#include <iostream>

using namespace std;

int main()
{
    int first=0,second=1,n,s;
    cout<<"Enter the length";
    cin>>n;
    cout<<"The fibonacci series is "<<first<<"\t "<<second;
    while(n!=0)
    {
        s=first+second;
        cout<<"\t "<<s;
        first=second;
        second=s;
        n--;
    }
    return 0;
}
