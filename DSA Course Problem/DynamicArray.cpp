#include<bits/stdc++.h>
using namespace std;
void arrays(int capacity){
    
}
int main (){
    int t;
    cin>>t;
    while (t--)
    {   
        int size, capacity;
        capacity = 1;
        while(size<capacity){
            capacity*=2;
        }
        arrays(capacity);
    }
    
}