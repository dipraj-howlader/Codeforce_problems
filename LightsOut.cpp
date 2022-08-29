// Dipraj
// 275A cf
#include <bits/stdc++.h>
#include<ext/pb_ds/assoc_container.hpp>
using namespace std;
#define FAST_IO ios_base::sync_with_stdio(false); cin.tie(NULL)
#define yes cout<<"YES"<<"\n";
#define no cout<<"NO"<<"\n";
#define ll long long int;

int main()
{
    FAST_IO;
    int arr[9];
    int a =9;
    int i=0;
    while (a--)
    {
        int input;
        cin>>input;
        if(input%2==0)
        arr[i]=0;
        else
        arr[i]=1;
        i++;
    }
    //1st line
    cout<< ((arr[0]+arr[1]+arr[3])%2==0? "1":"0");
    cout<<((arr[0]+arr[1]+arr[2]+arr[4])%2==0?"1":"0");
    cout<<((arr[2]+arr[1]+arr[5])%2==0?"1":"0")<<endl;
//2nd line
    cout<< ((arr[0]+arr[6]+arr[3]+arr[4])%2==0? "1":"0");
    cout<<((arr[3]+arr[1]+arr[5]+arr[4]+arr[7])%2==0?"1":"0");
    cout<<((arr[2]+arr[8]+arr[5]+arr[4])%2==0?"1":"0")<<endl;
//3rd line
    cout<< ((arr[6]+arr[7]+arr[3])%2==0? "1":"0");
    cout<<((arr[6]+arr[7]+arr[8]+arr[4])%2==0?"1":"0");
    cout<<((arr[5]+arr[8]+arr[7])%2==0?"1":"0")<<endl;
    
}