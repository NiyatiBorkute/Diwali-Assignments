#include <iostream>
using namespace std;

int main() {
    int n;
    cout <<"Enter the value of n:";
    cin>>n;
    cout <<"Prime numbers up to ";

    for (int i=2; i<=n; i++) {
        int j;
        for (j=2; j<i;j++) {
            if (i%j==0)
                break;
        }
        if(j==i)
            cout<<i<<" ";
    }
    cout << endl;
    return 0;
}

