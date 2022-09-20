// Dipraj

#include <bits/stdc++.h>
using namespace std;
#define FAST_IO ios_base::sync_with_stdio(false); cin.tie(NULL)
#define yes cout<<"YES"<<"\n";
#define no cout<<"NO"<<"\n";
#define ll long long int

int main()
{
    FAST_IO;
    int t;
    cin>>t;
    vector<string> vec;
    while (t--)
    {
        int x,y,z,empty;
        cin>>x>>y>>z>>empty;
        int sum = x+y+z;
        if(sum%3==0){
           int mid = sum / 3;
           bool check = false;
           if(x>mid)  x = x -mid;
           else x = mid - x;
           
              if(y>mid)  y = y -mid;
           else y = mid - y;

             if(z>mid)  z = z -mid;
           else z = mid - z;
        if(x%empty==0 && y%empty==0 && z%empty==0)
        check = true;
        if(check) vec.push_back("Peaceful");
        else vec.push_back("Fight");
        }   
        else{
            vec.push_back("Fight");
        }
    }
    for (int i = 0; i < vec.size(); i++)
    {
        cout<<"Case "<<i+1<<": "<<vec[i]<<endl;
    }
    
}