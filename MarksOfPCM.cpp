// Dipraj

#include <bits/stdc++.h>
#include<map>
using namespace std;
#define FAST_IO ios_base::sync_with_stdio(false); cin.tie(NULL)
#define yes cout<<"YES"<<"\n";
#define no cout<<"NO"<<"\n";
#define ll long long int;


bool should_i_swap( pair< int, pair<int,int>> a, pair< int, pair<int,int>> b){
    if(a.first!=b.first){
        if(a.first> b.first)
        return true;
        return false;
    }
    else{
        if(a.second.first != b.second.first)
        {
            if(a.second.first > b.second.first) return false;
        return true;
        }
        else{
                if(a.second.second > b.second.second) return true;
                return false;
        }
    }
}


int main()
{
    FAST_IO;
    int t;
    cin>>t;
    int n =t;
    pair< int, pair<int,int>> database[t];
    for (int i = 0; i < t; i++)
    {
        int x,y,z;
        cin>>x>>y>>z;
        database[i].first = x;
        database[i].second.first=y;
        database[i].second.second=z;
    }
    for (int i = 0; i < n; i++)
    {
        for (int  j = i+1; j < n; j++)
        {
            if(should_i_swap(database[i], database[j])){
                swap(database[i],database[j]);
            }
        }
        
    }
    
    // sort(database, database+t, should_i_swap);
    cout<<endl;
    cout<<endl;
    for (int i = 0; i < t; i++)
    {
        cout<<database[i].first<< " "<<database[i].second.first<< " "<< database[i].second.second<<endl;
    }
    
    
}