// Dipraj
//903C Problem
#include <bits/stdc++.h>
using namespace std;
#define FAST_IO ios_base::sync_with_stdio(false); cin.tie(NULL)
#define yes cout<<"YES"<<"\n";
#define no cout<<"NO"<<"\n";
#define ll long long int;

int main(){
    FAST_IO;
    int t;
    cin>>t;
    int n = t;
     map<int, int> st;
     while (t--)
     {
        int x;
        cin>>x;
        st[x]++;
     }
     auto it = --st.end();
     int value = (*it).second;
     int large = 0;
     for (auto  i = st.begin(); i != st.end(); i++)
     {
        int num  = (*i).first;
        int num2 = (*i).second-value;
        // cout<<num<<" "<<i->second<<endl;
        if(st[num]<=value){
            st[num] = 0;
        }
        else{
            st[num] =  num2;
            if(num2>large) 
            large = num2;
        }
     }
     value = large + value;
    cout<<value<<endl;
}