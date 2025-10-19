#include<iostream>
using namespace std;
 
int main(){
    cout<<"Enter number fibonacci series upto:"<<endl;
    int num;
    cin>>num;
    int f1=0;
    int f2=1;
    cout<<f1<<" "<<f2<<" ";
    int f3; 
    for (int i=1;i<num-1;i++){
        f3=f1+f2;
        cout<<f3<<" ";
        f1=f2;
        f2=f3;
        
    }
}