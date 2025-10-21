#include <iostream>
using namespace std;

int main() {
    int a, b, gcd, lcm;
    cout << "Enter two numbers: ";
    cin >> a >> b;

    int x = a;
    int y = b;

    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    gcd = a;

    lcm = (x * y) / gcd;
    

    cout << "GCD = " << gcd << endl;
    cout << "LCM = " << lcm << endl;

    return 0;
}
