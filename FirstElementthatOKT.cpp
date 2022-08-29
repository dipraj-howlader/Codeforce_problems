// Dipraj

#include <bits/stdc++.h>
using namespace std;
#define FAST_IO ios_base::sync_with_stdio(false); cin.tie(NULL)
#define yes cout<<"YES"<<"\n";
#define no cout<<"NO"<<"\n";
#define ll long long int;

int main()
{
    FAST_IO;
    int n,t;
    cin>>n>>t;
   unordered_map<int, int> st;
    for (int i = 0; i < n; i++)
    {
        int x;
        cin>>x;
        if(st[x]==0){
            st[x] = 1;
        }
        else{
            st[x]+=1;
        }
    }
    st.reserve(n);
    for (auto  it = st.begin();  it!= st.end(); it++)
    {
        if((*it).second >=t){
        cout<<(*it).first<<endl;
        break;}
    }
    
    
}