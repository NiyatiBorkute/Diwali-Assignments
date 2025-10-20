#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter n: ";
    cin >> n;

    int sum = 0;

    for (int i = 1; i <= n; i++) {
        sum += (2 * i - 1);
    }

    cout << "Sum of first " << n << " odd numbers = " << sum << endl;

    return 0;
}
