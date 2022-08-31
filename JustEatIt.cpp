// Dipraj
//unsolved

#include <bits/stdc++.h>
using namespace std;
#define FAST_IO                       \
    ios_base::sync_with_stdio(false); \
    cin.tie(NULL)
#define yes cout << "YES" \
                 << "\n";
#define no cout << "NO" \
                << "\n";
#define ll long long int

int main()
{
    FAST_IO;
    ll t;
    cin >> t;
    while (t--)
    {
        ll n;
        cin>>n;
        ll sum = 0;
        bool is_neg = false;
        ll large = 0;
        ll insideSum = 0;
        vector<ll> v;
        for (ll i = 0; i < n; i++)
        {
            ll x;
            cin >> x;
            sum = sum + x;
            if (x < 0)
                is_neg = true;
            if (x < 0)
                v.push_back(0);
            else
                v.push_back(x);
        }
        if (is_neg == false)
            yes 
            else
            {
                for (ll i = 0; i < n; i++)
                {
                    if (v[i] != 0)
                    {
                        insideSum += v[i];
                        if (insideSum > large)
                            large = insideSum;
                    }
                    else
                    {
                        insideSum = 0;
                    }
                }

                if (large >= sum)
                    no else yes
            }

        v.clear();
    }
}