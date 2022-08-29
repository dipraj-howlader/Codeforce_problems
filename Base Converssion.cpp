//Dipraj

#include <bits/stdc++.h>
using namespace std;

void deci_to_bin(int x, string & bin_num)
{

	// Base Case
	if (x <= 1)
		bin_num += (char)(x + '0');
	else {
	
		// Recursion call
		deci_to_bin(x / 2, bin_num);
	
		// If x is divisible by 2
		if(x%2)
		bin_num += '1';
	
		// otherwise
		else
		bin_num += '0';
	}
}

// Driver code
int main()
{
	int n;
    cin>>n;
    while(n--){
    long long int decimal_number;
    cin>>decimal_number;
    string bin_num = "";
	 deci_to_bin(decimal_number,bin_num);
     cout<< bin_num<<endl;

    }
	return 0;
}
