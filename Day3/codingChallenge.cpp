#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter the size of array (n): ";
    cin >> n;

    int arr[n];
    cout << "Enter " << n << " numbers from 0 to " << n << " (one missing): ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    int total = n * (n + 1) / 2;

    
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += arr[i];
    }

    int missing = total - sum;

    cout << "Missing number is: " << missing << endl;

    return 0;
}
