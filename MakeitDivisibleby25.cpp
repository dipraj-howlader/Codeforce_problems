// Dipraj
// unsolved
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
    while (t--)
    {
        int x;
        cin>>x;
        if(x%2==0)
        cout<<0<<endl;
        else{
            char last;
            int indexLast = 0;
            int indexFirst = 0;
            string str = to_string(x);
            for (int i =  str.length()-1; i >=0; i--)
            {
                if(str.at(i)=='5' ||str.at(i)=='0'){
                    last = str.at(i);
                    indexLast = i;
                    break;
                }   
            }
            char sr1,sr2;
            if(last=='5')
            {
                sr1 = '2';
                sr2 = '7';
            }
            else{
                sr1 = '0';
                sr2 = '5';
            }
             for (int i = 0; i < str.length(); i++)
            {
                if(str.at(i)==sr1 || str.at(i)==sr2){
                    indexFirst = i;
                    break;
                }
            }
            int midlePart = indexLast-indexFirst-1;
            int lastPart = str.length()-indexLast-1;
            cout<<midlePart+lastPart<<endl;

        }
    }
    
}