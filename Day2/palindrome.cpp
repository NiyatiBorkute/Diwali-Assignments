#include <iostream>
using namespace std;

int main() {
    int n, original, reversed = 0;
    cout << "Enter a number: ";
    cin >> n;

    original = n;  

    while (n > 0) {
        int digit = n % 10;        
        reversed = reversed * 10 + digit; 
        n = n / 10;                 
    }

    if (original == reversed)
        cout << "True (It is a palindrome)" << endl;
    else
        cout << "False (Not a palindrome)" << endl;

    return 0;
}
