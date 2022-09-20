// Dipraj

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
    int n;
    cin >> n;

    while (n--)
    {
        ll num;
        queue<int> st;
        cin >> num;
        while (num != 0)
        {
            int pu = num%10;
            st.push(pu);
            num = num / 10;
        }
        int pastSize = st.size();
        int five = 0;
        int zero = 0;
        for (int i = 0; i <pastSize; i++)
        {
            int top = st.front();
            st.pop();
            if (five == -1)
            {
                if (top == 2 || top == 7)
                {
                    break;
                }
            }
            if (zero == -2)
            {
                if (top ==0 || top ==5)
                break;
            }
            if ((top == 5 || top == 0) && (five == 0 || zero == 0))
            {
                if (top == 5)
                    five = -1;
                else
                    zero = -2;
            }
        }
        cout <<pastSize- (st.size() + 2) << endl;
        pastSize =0;
        
    }
}