// Dipraj

#include <bits/stdc++.h>
using namespace std;
#define FAST_IO ios_base::sync_with_stdio(false); cin.tie(NULL)
#define yes cout<<"Yes"<<"\n";
#define no cout<<"No"<<"\n";
#define ll long long int
void solution()
{
    int a, b, c;
    bool slv = 0;
    cin >> a >> b >> c;
    /* for(int i=1;i<=500;i++){
     int x=b*i;
     int diff=c-x;
     if(diff%a==0){
     slv=1;
     break;
     }
     }
     if(slv==1){
     cout<<"Yes"<<endl;
     }
     else
     cout<<"No"<<endl;*/
    for (int i = 0; i <= 10000; i++)
    {
        if (slv == 0)
        {
            for (int j = 0; j <= 10000; j++)
            {
                if (((i * a) + (j * b)) == c)
                {
                    yes
                        slv = 1;
                    break;
                }
            }
        }
    }
    if (slv == 0)
        no
}

int main()
{
    FAST_IO;
    solution();
    return 0;
}
