// Dipraj
// Team contest done
#include <bits/stdc++.h>
using namespace std;
#define FAST_IO ios_base::sync_with_stdio(false); cin.tie(NULL)
#define yes cout<<"Yes"<<"\n";
#define no cout<<"No"<<"\n";
#define ll long long int

int findTrailingZeros(int n)
{
    if (n < 0) // Negative Number Edge Case
        return -1;
 
    // Initialize result
    int count = 0;
 
    // Keep dividing n by powers of
    // 5 and update count
    for (int i = 5; n / i >= 1; i *= 5)
        count += n / i;
 
    return count;
}
int main()
{
    int zero;
    cin>>zero;
    int checkZero = 1;
    vector<int> vec ;
    for(int i = 5; checkZero<=zero;i++){
    int totalZeros =  findTrailingZeros(i);
    if(totalZeros==zero)
    vec.push_back(i);
    checkZero = totalZeros;
    }

    if(vec.size()==0) cout<<0<<endl;
    else{
        cout<<vec.size()<<endl;
        for(int x: vec){
            cout<<x<< " ";
        }
    }
}

  