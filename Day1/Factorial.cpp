#include<iostream>
using namespace std;

int main(){
    int fact=1;
    int num;
    cout<<"Enter the Number:"<<endl;
    cin>>num;
    for(int i=1;i<=num;i++){
        fact=fact*i;
    }
    cout<<"factorial of number is"<<fact;
}