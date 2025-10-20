#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter an integer: ";
    cin >> n;

    int reversed = 0;
    int sign = 1;

    // Handle negative numbers
    if (n < 0) {
        sign = -1;
        n = -n;
    }

    while (n > 0) {
        int digit = n % 10;          
        reversed = reversed * 10 + digit; 
        n /= 10;                     
    }

    reversed *= sign;  

    cout << "Reversed number: " << reversed << endl;

    return 0;
}
